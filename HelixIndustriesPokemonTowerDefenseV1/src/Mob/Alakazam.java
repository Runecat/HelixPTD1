package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Alakazam extends Mob{

	public Alakazam(BufferedImage[] b) {
		super(b);
		super.name = "Alakazam";
		super.health = 60;
		super.moveSpeed = 12;
		super.type = Type.PSYCHIC;
		super.money = 20;	
	}
}
