package networking;

public class DisconnectCommand extends Command<GameServer>
{
	private String clientName; // client who is disconnecting
	
	public DisconnectCommand(String name){
		clientName = name;
	}
	
	public void execute(GameServer executeOn) {
		// disconnect client
		executeOn.disconnect(clientName);
	}

}
