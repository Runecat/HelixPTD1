package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Seel extends Mob{

	public Seel(BufferedImage[] b) {
		super(b);
		super.name = "Dewgong";
		super.health = 60;
		super.moveSpeed = 4;
		super.type = Type.ICE;
		super.money = 5;	}

}
