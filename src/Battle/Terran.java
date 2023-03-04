package GameDanhTran;

public class Terran extends ChungToc {
	public Terran(int HP, MoveMode moveMode, Attacks a) {
		super(HP, moveMode, a);
	}
	
	public static Terran spawn() {
		int rand = Rand.random(3);
		if (rand == 0) {
			return new Marine();
		}
		else if (rand == 1) {
			return new Firebat();
		}
		else {
			return new Wraith();
		}
	}
}
