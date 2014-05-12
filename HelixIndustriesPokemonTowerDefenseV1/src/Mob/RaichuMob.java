package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class RaichuMob extends Mob{

	public RaichuMob(BufferedImage[] b){
		super(b);
		super.name = "Raichu";
		super.health = 60;
		super.moveSpeed = 5;
		super.type = Type.ELECTRIC;
		super.money = 10;
	}
}
