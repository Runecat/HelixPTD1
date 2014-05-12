package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Exeggcute extends Mob{

	public Exeggcute(BufferedImage[] b) {
		super(b);
		super.name = "Exeggcute";
		super.health = 80;
		super.moveSpeed = 2;
		super.type = Type.GRASS;
		super.money = 5;
	}
	

}
