package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Game;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class ChatPanel extends JPanel {

	private Game theGame;

	JTextArea text;
	JScrollPane scrollpane;

	public ChatPanel(Game game) {
		this.theGame = game;

		this.setBackground(Color.MAGENTA);	// because we are fabulous.
		this.setLayout(new BorderLayout()); // might change this to another layout

		setUpChat();

	}

	private void setUpChat() {
		
		// set up the textArea
		text = new JTextArea();
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		text.setText("Chat:");
		text.setEditable(false);

		// set up the scrollPane
		scrollpane = new JScrollPane(text);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		// set up the inputField
		final JTextField userInputField = new JTextField(30);
		
		this.add(scrollpane);
		this.add(userInputField, BorderLayout.SOUTH);

		userInputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				// We get the text from the textfield
				String fromUser = userInputField.getText();

				if (fromUser != null) {

					// We append the text from the user
					if (theGame.getPlayers().size() != 0)
						text.append("\n"
								+ theGame.getPlayers().get(0).getName() + ": "
								+ fromUser);
					else
						text.append("\nNoPlayers: " + fromUser);

					// The pane auto-scrolls with each new response added
					text.setCaretPosition(text.getDocument().getLength());

					// We reset our text field to "" each time the user presses enter
					userInputField.setText("");
				}
			}
		});
		
	}
	
}
