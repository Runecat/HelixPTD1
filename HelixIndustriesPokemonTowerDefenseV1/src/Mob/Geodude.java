package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Geodude extends Mob{

	public Geodude(BufferedImage[] b){
		super(b);
		super.name = "Geodude";
		super.health = 75;
		super.moveSpeed = 2;
		super.type = Type.ROCK;
		super.money = 4;
	}
}
