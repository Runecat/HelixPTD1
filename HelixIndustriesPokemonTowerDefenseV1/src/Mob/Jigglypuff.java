package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Jigglypuff extends Mob{

	public Jigglypuff(BufferedImage[] b){
		super(b);
		super.name = "Jigglypuff";
		super.health = 50;
		super.moveSpeed = 1;
		super.type = Type.NORMAL;
		super.money = 5;
	}
}
