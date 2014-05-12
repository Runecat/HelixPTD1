package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class BlastoiseMob extends Mob{

	public BlastoiseMob(BufferedImage[] b) {
		super(b);
		super.name = "Blastoise";
		super.health = 600;
		super.moveSpeed = 5;
		super.type = Type.WATER;
		super.money = 0;	
	}
}
