package networking;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

import java.io.Serializable;

public abstract class Command<T> implements Serializable 
{
	private static final long serialVersionUID = -4838155228547508978L;

	public abstract void execute(T executeOn);
	
	public void undo(T undoOn)
	{
	}
}
