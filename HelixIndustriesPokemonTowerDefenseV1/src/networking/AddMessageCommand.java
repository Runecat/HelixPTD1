package networking;

/**
 *	AddMessageCommand
 * 
 *	Adds a text message to the server's chat log
 */
public class AddMessageCommand extends Command<GameServer>
{
	private String message; // message from client
	
	public AddMessageCommand(String message)
	{
		this.message = message;
	}
	
	public void execute(GameServer executeOn)
	{
		// add message to server's chat log
		executeOn.addMessage(message);
	}
}
