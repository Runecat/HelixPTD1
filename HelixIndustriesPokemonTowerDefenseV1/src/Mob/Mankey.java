package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Mankey extends Mob{

	public Mankey(BufferedImage[] b){
		super(b);
		super.name = "Mankey";
		super.health = 20;
		super.moveSpeed = 5;
		super.type = Type.FIGHTING;
		super.money = 3;
	}
}
