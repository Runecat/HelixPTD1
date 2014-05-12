package Mob;

import java.awt.image.BufferedImage;


import model.Type;

public class Meowth extends Mob{

	public Meowth(BufferedImage[] b) {
		super(b);
		super.name = "Meowth";
		super.health = 45;
		super.moveSpeed = 5;
		super.type = Type.NORMAL;
		super.money = 20;
	}
}
