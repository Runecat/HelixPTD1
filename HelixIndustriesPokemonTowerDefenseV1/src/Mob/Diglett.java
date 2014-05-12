package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Diglett extends Mob{

	
	public Diglett(BufferedImage[] b){
		super(b);
		super.name = "Diglett";
		super.health = 15;
		super.moveSpeed = 6;
		super.type = Type.GROUND;
		super.money = 3;
	}
}
