package networking;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

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
