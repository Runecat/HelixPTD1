package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Spearow extends Mob{


	public Spearow(BufferedImage[] b){
		super(b);
		super.name = "Spearow";
		super.health = 20;
		super.moveSpeed = 5;
		super.type = Type.FLYING;
		super.money = 4;
	}
}
