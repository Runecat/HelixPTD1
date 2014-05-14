package networking;

public class DisconnectCommand extends Command<GameChatServer>
{
	private String clientName; // client who is disconnecting
	
	public DisconnectCommand(String name){
		clientName = name;
	}
	
	public void execute(GameChatServer executeOn) {
		// disconnect client
		executeOn.disconnect(clientName);
	}

}
