package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Caterpie extends Mob{


	
	public Caterpie(BufferedImage[] b){
		super(b);
		super.name = "Caterpie";
		super.health = 15;
		super.moveSpeed = 1;
		super.type = Type.BUG;
		super.money = 1;
	}
}