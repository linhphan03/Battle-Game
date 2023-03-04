package GameDanhTran;

public abstract class ChungToc {
	static enum MoveMode {
		GROUND,
		AIR
	}
	static enum Type {
		TERRAN,
		PROTOSS
	}
	protected int HP;
	protected MoveMode moveMode;
	protected Attacks attack;
	
	public ChungToc(int HP, MoveMode mode, Attacks a) {
		this.HP = HP;
		this.moveMode = mode;
		this.attack = a;
	}
	
	public MoveMode getMoveMode() {
		return this.moveMode;
	}

	public int getHP() {
		return this.HP;
	}
	
	public int getGroundAttack() {
		return this.attack.getGroundAttack();
	}
	
	public int getAirAttack() {
		return this.attack.getAirAttack();
	}
	
	public void beAttacked(int attackerDamage) {
		this.HP = this.HP - attackerDamage;
	}
	
	public boolean isAlive() {
		if (getHP() <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int getTotalAttack() {
		return attack.airAttack + attack.groundAttack;
	}
	
	public String toString() {
		String info = this.getClass().getSimpleName() + " (" 
	+ this.moveMode + ", " + this.HP + ")";
		return info;
	}
}
