package networking;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import model.Tile;


/*
 * Modified by Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * Original by Gabe Kishi
 * 
 */
public class GameServer 
{
	private ServerSocket socket; // the server socket
	
	private List<String> messages;	// the chat log
	private HashMap<String, ObjectOutputStream> outputs; // map of all connected users' output streams
	private Tile[][] grid;
	private int money;
	private int health;
	
	/**
	 *	ClientHandler
	 *	
	 *	This thread reads and executes commands sent by a client
	 */
	private class ClientHandler implements Runnable{
		private ObjectInputStream input; // the input stream from the client
		
		public ClientHandler(ObjectInputStream input){
			this.input = input;
		}
		
		public void run() {
			try{
				while(true){
					// read a command from the client, execute on the server
					Command<GameServer> command = (Command<GameServer>)input.readObject();
					command.execute(GameServer.this);
					
					// terminate if client is disconnecting
					if (command instanceof DisconnectCommand){
						input.close();
						return;
					}
				}
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *	ClientAccepter
	 *	
	 *	This thread listens for and sets up connections to new clients
	 */
	private class ClientAccepter implements Runnable{
		public void run() {
			try{
				while(true){
					// accept a new client, get output & input streams
					Socket s = socket.accept();
					ObjectOutputStream output = new ObjectOutputStream(s.getOutputStream());
					ObjectInputStream input = new ObjectInputStream(s.getInputStream());
					
					// read the client's name
					String clientName = (String)input.readObject();
					
					// map client name to output stream
					outputs.put(clientName, output);
					
					// spawn a thread to handle communication with this client
					new Thread(new ClientHandler(input)).start();
					
					// add a notification message to the chat log
					addMessage(clientName + " connected");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public GameServer(){
		this.messages = new ArrayList<String>(); // create the chat log
		this.outputs = new HashMap<String, ObjectOutputStream>(); // setup the map
		
		try{
			// start a new server on port 9001
			socket = new ServerSocket(9001);
			System.out.println("NRCServer started on port 9001");
			
			// spawn a client accepter thread
			new Thread(new ClientAccepter()).start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds a message to the chat log. Called by an AddMessageCommand.
	 * 
	 * @param message	message to add
	 */
	public void addMessage(String message){
		messages.add(message);
		updateClients();
	}

	/**
	 * Writes an UpdateClientCommand to every connected user.
	 */
	public void updateClients() {
		// make an UpdateClientCommmand, write to all connected users
		UpdateClientCommand update = new UpdateClientCommand(messages);
		try{
			for (ObjectOutputStream out : outputs.values())
				out.writeObject(update);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new GameServer();
	}

	/**
	 * Disconnects a given user
	 * @param clientName	user to disconnect
	 */
	public void disconnect(String clientName) {
		try{
			outputs.get(clientName).close(); // close output stream
			outputs.remove(clientName); // remove from map
			
			// add notification message
			addMessage(clientName + " disconnected");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
