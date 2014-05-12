package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class EliteAlakazam extends Mob{

	public EliteAlakazam(BufferedImage[] b) {
		super(b);
		super.name = "Alakazam";
		super.health = 600;
		super.moveSpeed = 7;
		super.type = Type.PSYCHIC;
		super.money = 0;	
	}
}
