package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Sandshrew extends Mob{

	public Sandshrew(BufferedImage[] b){
		super(b);
		super.name = "Sandshrew";
		super.health = 35;
		super.moveSpeed = 2;
		super.type = Type.GROUND;
		super.money = 4;
	}
}
