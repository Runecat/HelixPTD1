package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Lapras extends Mob{

	public Lapras(BufferedImage[] b) {
		super(b);
		super.name = "Lapras";
		super.health = 800;
		super.moveSpeed = 3;
		super.type = Type.FIGHTING;
		super.money = 0;	
	}
}
