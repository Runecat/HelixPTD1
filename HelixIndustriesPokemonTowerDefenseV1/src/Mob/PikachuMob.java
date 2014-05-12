package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class PikachuMob extends Mob{

	public PikachuMob(BufferedImage[] b){
		super(b);
		super.name = "Pikachu";
		super.health = 40;
		super.moveSpeed = 4;
		super.type = Type.ELECTRIC;
		super.money = 5;
	}
}
