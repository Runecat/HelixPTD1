package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Zubat extends Mob{

	public Zubat(BufferedImage[] b){
		super(b);
		super.name = "Zubat";
		super.health = 10;
		super.moveSpeed = 2;
		super.type = Type.FLYING;
		super.money = 1;
	}
}
