package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Goldeen extends Mob{

	public Goldeen(BufferedImage[] b){
		super(b);
		super.name = "Goldeen";
		super.health = 30;
		super.moveSpeed = 4;
		super.type = Type.WATER;
		super.money = 3;
	}
}
