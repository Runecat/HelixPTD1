package Mob;

import java.awt.image.BufferedImage;

import model.Type;

public class Rhyhorn extends Mob{

	public Rhyhorn(BufferedImage[] b) {
		super(b);
		super.name = "Rhyhorn";
		super.health = 200;
		super.moveSpeed = 4;
		super.type = Type.GROUND;
		super.money = 20;	
	}
}
