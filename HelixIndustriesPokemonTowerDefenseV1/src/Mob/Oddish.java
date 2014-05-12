package Mob;

import java.awt.image.BufferedImage;
import model.Type;

public class Oddish extends Mob{

	public Oddish(BufferedImage[] b) {
		super(b);
		super.name = "Oddish";
		super.health = 30;
		super.moveSpeed = 2;
		super.type = Type.GRASS;
		super.money = 2;
	}

}
