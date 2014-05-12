package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Poliwag extends Mob{

	public Poliwag(BufferedImage[] b){
		super(b);
		super.name = "Poliwag";
		super.health = 35;
		super.moveSpeed = 5;
		super.type = Type.WATER;
		super.money = 4;
	}
}
