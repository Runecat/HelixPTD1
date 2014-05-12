package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Weedle extends Mob{

	public Weedle(BufferedImage[] b){
		super(b);
		super.name = "Weedle";
		super.health = 15;
		super.moveSpeed = 1;
		super.type = Type.POISON;
		super.money = 1;
	}
}
