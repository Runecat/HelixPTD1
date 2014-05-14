package networking;

/**
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 * 
 * Original by Gabe Kishi
 */
public class UpdateMessageCommand extends Command<GameServer>
{
	private String message; // message from client
	
	public UpdateMessageCommand(String message)
	{
		this.message = message;
	}
	
	public void execute(GameServer executeOn)
	{
		// add message to server's chat log
		executeOn.addMessage(message);
	}
}
