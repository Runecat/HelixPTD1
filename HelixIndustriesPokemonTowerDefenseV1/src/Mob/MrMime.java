package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class MrMime extends Mob{

	public MrMime(BufferedImage[] b) {
		super(b);
		super.name = "Mr. Mime";
		super.health = 60;
		super.moveSpeed = 7;
		super.type = Type.PSYCHIC;
		super.money = 9;	}

}
