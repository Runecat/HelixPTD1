package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class CharizardMob extends Mob{

	public CharizardMob(BufferedImage[] b) {
		super(b);
		super.name = "Charizard";
		super.health = 600;
		super.moveSpeed = 5;
		super.type = Type.FIRE;
		super.money = 0;
	}

}
