package networking;

/**
 *	AddMessageCommand
 * 
 *	Adds a text message to the server's chat log
 */
public class AddMessageCommand extends Command<GameChatServer>
{
	private String message; // message from client
	
	public AddMessageCommand(String message)
	{
		this.message = message;
	}
	
	public void execute(GameChatServer executeOn)
	{
		// add message to server's chat log
		executeOn.addMessage(message);
	}
}
