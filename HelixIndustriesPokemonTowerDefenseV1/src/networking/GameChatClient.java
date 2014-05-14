package networking;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */
public class GameChatClient extends JFrame {
	private JTextArea textArea; // chat log displayed here
	private String clientName; // user name of the client
	
	private Socket server; // connection to server
	private ObjectOutputStream out; // output stream
	private ObjectInputStream in; // input stream

	/**
	 * Ready made GUI for a NRC client by Gabe Kishi
	 */
	private class ChatPanel extends JPanel{
		public ChatPanel(){
			/* Setup the GUI */
			this.setLayout(new BorderLayout());
			this.setPreferredSize(new Dimension(800, 600));
			
			// create gui components
			final JTextField textField = new JTextField();
			JButton enterButton = new JButton("Send");
			
			textField.setPreferredSize(new Dimension(600, 40));
			enterButton.setPreferredSize(new Dimension(100, 40));
			
			// add button and field to a lower panel
			JPanel bottomPanel = new JPanel();
			bottomPanel.add(textField);
			bottomPanel.add(enterButton);
			
			// add text area and lower panel
			this.add(new JScrollPane(textArea), BorderLayout.CENTER);
			this.add(bottomPanel, BorderLayout.SOUTH);
			
			// create a listener for writing messages to server
			ActionListener listener = new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					String s = textField.getText();
					try{
						out.writeObject(new UpdateMessageCommand(clientName + ":  " + s));
					}catch(Exception e){
						e.printStackTrace();
					}
					textField.setText("");
				}
			};
			
			// attach listener to field & button
			textField.addActionListener(listener);
			enterButton.addActionListener(listener);
		}
	}
	
	/**
	 * ServerHandler
	 * 
	 * This class reads and executes commands sent from the server
	 * 
	 * @author Gabriel Kishi
	 *
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try{
				while(true){
					// read a command from server and execute it
					Command<GameChatClient> c = (Command<GameChatClient>)in.readObject();
					c.execute(GameChatClient.this);
				}
			}
			catch(SocketException e){
				return; // "gracefully" terminate after disconnect
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public GameChatClient(){
		// ask the user for a host, port, and user name
		String host = JOptionPane.showInputDialog("Host address:");
		String port = JOptionPane.showInputDialog("Host port:");
		clientName = JOptionPane.showInputDialog("User name:");
		
		if (host == null || port == null || clientName == null)
			return;
		
		try{
			// Open a connection to the server
			server = new Socket(host, Integer.parseInt(port));
			out = new ObjectOutputStream(server.getOutputStream());
			in = new ObjectInputStream(server.getInputStream());
			
			// write out the name of this client
			out.writeObject(clientName);
			
			// add a listener that sends a disconnect command to when closing
			this.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent arg0) {
					try {
						out.writeObject(new DisconnectCommand(clientName));
						out.close();
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			
			setupGUI();
			
			// start a thread for handling server events
			new Thread(new ServerHandler()).start();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 	Creates a ChatPanel and adds it to this frame
	 */
	private void setupGUI() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make the JTextArea
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		// add a Chat Panel
		this.add(new ChatPanel());
		
		this.setVisible(true);
	}

	/**
	 * Updates the chat log. Called by UpdateClientCommands
	 */
	public void update(List<String> messages) {
		String s = "";
		for (String message: messages)
			s = s + message + "\n";
		
		textArea.setText(s);
		textArea.setCaretPosition(s.length());
		repaint();
	}
	
	public static void main(String[] args){
		new GameChatClient();
	}
}
