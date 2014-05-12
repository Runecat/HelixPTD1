package Mob;

import java.awt.image.BufferedImage;
import java.io.File;

import model.Type;

public class Pidgey extends Mob{

	public Pidgey(BufferedImage[] b){
		super(b);
		super.name = "Pidgey";
		super.health = 20;
		super.moveSpeed = 2;
		super.type = Type.FLYING;
		super.money = 2;
	}
}
