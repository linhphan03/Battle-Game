package GameDanhTran;

public class Protoss extends ChungToc {
	protected int PS; 
	
	public Protoss(int HP, MoveMode moveMode, Attacks a, int PS) {
		super(HP, moveMode, a);
		this.PS = PS;
	}
	
	public int getHP() {
		return this.HP + this.PS;
	}
	
	public void beAttacked(int terranAttack) {
		if (this.PS - terranAttack > 0) {
			this.PS = this.PS - terranAttack;
		}
		else {
			this.HP = this.HP - terranAttack;
		}
	}
	
	public String toString() {
		String info = this.getClass().getSimpleName() + " (" 
	+ this.moveMode + ", " + this.HP + "/" + this.PS + ")";
		return info;
	}
	
	public static Protoss spawn() {
		int rand = Rand.random(3);
		if (rand == 0) {
			return new Zealot();
		}
		else if (rand == 1) {
			return new Dragon();
		}
		else {
			return new Scout();
		}
	}
}
