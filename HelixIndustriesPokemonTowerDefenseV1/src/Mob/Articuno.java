package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Articuno extends Mob{

	public Articuno(BufferedImage[] b) {
		super(b);
		super.name = "Articuno";
		super.health = 200;
		super.moveSpeed = 7;
		super.type = Type.ICE;
		super.money = 100;	
		}

}
