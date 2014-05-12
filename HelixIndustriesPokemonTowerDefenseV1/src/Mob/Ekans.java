package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Ekans extends Mob{

	public Ekans(BufferedImage[] b){
		super(b);
		super.name = "Ekans";
		super.health = 25;
		super.moveSpeed = 3;
		super.type = Type.POISON;
		super.money = 2;
	}
}
