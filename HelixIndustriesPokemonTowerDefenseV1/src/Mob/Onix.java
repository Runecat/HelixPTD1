package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Onix extends Mob{

	public Onix(BufferedImage[] b){
		super(b);
		super.name = "Onix";
		super.health = 100;
		super.moveSpeed = 4;
		super.type = Type.GROUND;
		super.money = 10;
	}
}
