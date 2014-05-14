package networking;

import java.util.List;
import java.util.LinkedList;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

/**
 * UpdateClientCommand
 * 
 * Updates a client with the current list of chat messages
 * 
 * @author Gabriel Kishi
 *
 */
public class UpdateClientCommand extends Command<GameChatClient> {
	private List<String> messages; // the message log from the server
	
	public UpdateClientCommand(List<String> messages){
		this.messages = new LinkedList<String>(messages);
	}

	public void execute(GameChatClient executeOn) {
		// update the client
		executeOn.update(messages);
	}
}
