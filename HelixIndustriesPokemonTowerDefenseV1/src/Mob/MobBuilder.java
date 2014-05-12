package Mob;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MobBuilder {

	private final int spriteWidth = 20;
	private final int spriteHeight = 20;
	private final int spriteRows = 16;
	private final int spriteColumns = 7;
	private final int offset = 20;
	private BufferedImage[] mobSprites;
	public BufferedImage[] sprites;

	public MobBuilder() {
		mobSprites = cutMobSheet();
	}

	private BufferedImage[] cutMobSheet() {

		BufferedImage mobSpriteSheet = null;
		try {
			mobSpriteSheet = ImageIO.read(new File(
					"Images/CondensedOverworldSprites.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedImage pokemonSpriteSheet = null;
		try {
			pokemonSpriteSheet = ImageIO.read(new File("Images/CondensedPokemonSprites.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedImage[] mobSprites = new BufferedImage[spriteRows
				* spriteColumns];
		System.out
				.println("Rows: " + spriteRows + " Columns: " + spriteColumns);
		for (int i = 0; i < spriteColumns; i++) {
			for (int j = 0; j < spriteRows; j++) {
				mobSprites[(i * spriteRows) + j] = mobSpriteSheet.getSubimage(j
						* spriteWidth, i * spriteHeight + offset, spriteWidth,
						spriteHeight);
				System.out.println(i * spriteRows + j + "," + i * spriteWidth
						+ "," + ((j * spriteHeight) + offset) + ","
						+ spriteWidth + "," + spriteHeight);
			}
		}
		
		sprites = new BufferedImage[spriteRows*spriteColumns];
	  	System.out.println("Rows: "+ spriteRows + " Columns: " + spriteColumns);
	  	for(int i = 0; i<spriteColumns;i++)
	  	{
	  		for(int j = 0; j<spriteRows;j++)
	  		{
	  			sprites[(i*spriteRows)+j] = pokemonSpriteSheet.getSubimage(
		  				j*spriteWidth,
		  				i*spriteHeight+offset,
		  				spriteWidth,
		  				spriteHeight);
	  			System.out.println(i*spriteRows+j +","+ i*spriteWidth + "," + ((j*spriteHeight)+offset) + "," + spriteWidth + "," + spriteHeight);
	  		}
	  	}

		return mobSprites;
	}

	public Mob buildMob(MobID i) {

		Mob mob;

		switch (i) {

		case AERODACTYL: mob = new Aerodactyl(mobSprites[4]);

		case ALAKAZAM: mob = new Alakazam(mobSprites[3]);

		case ARBOK: mob = new Arbok(mobSprites[9]);

		case ARCANINE: mob = new Arcanine(mobSprites[7]);

		case ARTICUNO: mob = new Articuno(sprites[88]);

		case BELLSPROUT: mob = new Bellsprout(mobSprites[8]);

		case BLASTOISE: mob = new BlastoiseMob(mobSprites[2]);

		case CATERPIE: mob = new Caterpie(mobSprites[14]);

		case CHARIZARD: mob = new CharizardMob(mobSprites[3]);

		case CLOYSTER: mob = new Cloyster(mobSprites[2]);

		case DEWGONG: mob = new Dewgong(mobSprites[2]);

		case DIGLETT: mob = new Diglett(mobSprites[3]);

		case DODRIO: mob = new Dodrio(mobSprites[4]);

		case DODUO: mob = new Doduo(mobSprites[4]);

		case DRAGONAIR: mob = new Dragonair(mobSprites[9]);

		case DRAGONITE: mob = new Dragonite(mobSprites[9]);

		case DROWZEE: mob = new Drowzee(mobSprites[3]);

		case DUGTRIO: mob = new Dugtrio(mobSprites[3]);

		case EKANS: mob = new Ekans(mobSprites[9]);

		case ELITE_ALAKAZAM: mob = new EliteAlakazam(mobSprites[3]);

		case ELITE_ARBOK: mob = new EliteArbok(mobSprites[9]);

		case ELITE_EXEGGUTOR: mob = new EliteExeggutor(mobSprites[8]);

		case ELITE_HAUNTER: mob = new EliteHaunter(mobSprites[3]);

		case ELITE_ONIX: mob = new EliteOnix(mobSprites[9]);

		case ELITE_RHYDON: mob = new EliteRhydon(mobSprites[3]);

		case EXEGGCUTE: mob = new Exeggcute(mobSprites[8]);

		case FEAROW: mob = new Fearow(mobSprites[4]);

		case GASTLY: mob = new Gastly(mobSprites[3]);

		case GENGAR: mob = new Gengar(mobSprites[3]);

		case GEODUDE: mob = new Geodude(mobSprites[3]);

		case GLOOM: mob = new Gloom(mobSprites[8]);

		case GOLBAT: mob = new Golbat(mobSprites[3]);

		case GOLDEEN: mob = new Goldeen(mobSprites[2]);

		case GOLDUCK: mob = new Golduck(mobSprites[3]);

		case GRAVELER: mob = new GravelerMob(mobSprites[3]);

		case GROWLITHE: mob = new Growlithe(mobSprites[7]);

		case GYARADOS: mob = new Gyarados(mobSprites[9]);

		case HAUNTER: mob = new Haunter(mobSprites[1]);

		case HITMONCHAN: mob = new Hitmonchan(mobSprites[3]);

		case HITMONLEE: mob = new Hitmonlee(mobSprites[3]);

		case HORSEA: mob = new Horsea(mobSprites[2]);

		case HYPNO: mob = new Hypno(mobSprites[3]);

		case JIGGLYPUFF: mob = new Jigglypuff(mobSprites[1]);

		case JYNX: mob = new Jynx(mobSprites[3]);

		case KADABRA: mob = new Kadabra(mobSprites[3]);

		case KINGLER: mob = new Kingler(mobSprites[2]);

		case KOFFING: mob = new Koffing(mobSprites[3]);

		case LAPRAS: mob = new Lapras(mobSprites[2]);

		case LICKITUNG: mob = new Lickitung(mobSprites[3]);

		case MACHAMP: mob = new Machamp(mobSprites[3]);

		case MACHOKE: mob = new Machoke(mobSprites[3]);

		case MACHOP: mob = new Machop(mobSprites[3]);

		case MAGNEMITE: mob = new Magnemite(mobSprites[5]);

		case MANKEY: mob = new Mankey(mobSprites[3]);

		case MAROWAK: mob = new Marowak(mobSprites[3]);

		case MEOWTH: mob = new Meowth(mobSprites[3]);

		case MOLTRES: mob = new Moltres(sprites[91]);

		case MRMIME: mob = new MrMime(mobSprites[3]);

		case MUK: mob = new Muk(mobSprites[3]);

		case NIDOKING: mob = new Nidoking(mobSprites[3]);

		case NIDORINO: mob = new Nidorino(mobSprites[3]);

		case NINETALES: mob = new Ninetales(mobSprites[7]);

		case ODDISH: mob = new Oddish(mobSprites[8]);

		case ONIX: mob = new Onix(mobSprites[9]);

		case PARASECT: mob = new Parasect(mobSprites[14]);

		case PIDGEOT: mob = new Pidgeot(mobSprites[4]);

		case PIDGEOTTO: mob = new Pidgeotto(mobSprites[4]);

		case PIDGEY: mob = new Pidgey(mobSprites[4]);

		case PIKACHU: mob = new PikachuMob(mobSprites[1]);

		case POLIWAG: mob = new Poliwag(mobSprites[3]);

		case PONYTA: mob = new Ponyta(mobSprites[7]);

		case PSYDUCK: mob = new Psyduck(mobSprites[3]);

		case RAICHU: mob = new RaichuMob(mobSprites[1]);

		case RAPIDASH: mob = new Rapidash(mobSprites[7]);

		case RATICATE: mob = new Raticate(mobSprites[7]);

		case RATTATA: mob = new Rattata(mobSprites[7]);

		case RHYDON: mob = new Rhydon(mobSprites[3]);

		case RHYHORN: mob = new Rhyhorn(mobSprites[7]);

		case SANDSHREW: mob = new Sandshrew(mobSprites[1]);

		case SEEL: mob = new Seel(mobSprites[2]);

		case SHELLDER: mob = new Shellder(mobSprites[2]);

		case SLOWBRO: mob = new Slowbro(mobSprites[3]);

		case SLOWPOKE: mob = new Slowpoke(mobSprites[7]);

		case SNORLAX: mob = new Snorlax(sprites[88]);

		case SPEAROW: mob = new Spearow(mobSprites[4]);

		case STARMIE: mob = new Starmie(mobSprites[2]);

		case STARYU: mob = new Staryu(mobSprites[2]);

		case TANGELA: mob = new Tangela(mobSprites[8]);

		case TAUROS: mob = new Tauros(mobSprites[7]);

		case TENTACOOL: mob = new Tentacool(mobSprites[2]);

		case TENTACRUEL: mob = new Tentacruel(mobSprites[2]);

		case VENONAT: mob = new Venonat(mobSprites[14]);
		
		case VENOMOTH: mob = new Venonat(mobSprites[14]);

		case VENASAUR: mob = new VenusaurMob(mobSprites[8]);

		case VICTREEBELL: mob = new Victreebell(mobSprites[8]);

		case VILEPLUME: mob = new Vileplume(mobSprites[8]);

		case VOLTORB: mob = new Voltorb(mobSprites[5]);

		case VULPIX: mob = new Vulpix(mobSprites[7]);

		case WEEDLE: mob = new Weedle(mobSprites[14]);

		case WEEPINBELL: mob = new Weepinbell(mobSprites[8]);

		case WEEZING: mob = new Weezing(mobSprites[3]);

		case ZAPDOS: mob = new Zapdos(mobSprites[4]);

		case ZUBAT: mob = new Zubat(mobSprites[3]);

		default:
			mob = null;

		}

		return mob;
	}
}
