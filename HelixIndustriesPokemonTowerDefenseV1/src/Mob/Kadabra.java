package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Kadabra extends Mob{

	public Kadabra(BufferedImage[] b) {
		super(b);
		super.name = "Kadabra";
		super.health = 40;
		super.moveSpeed = 10;
		super.type = Type.PSYCHIC;
		super.money = 15;	}

}
