package GameDanhTran;

public class Attacks {
	protected int groundAttack;
	protected int airAttack;
	
	public Attacks(int g, int a) {
		this.groundAttack = g;
		this.airAttack = a;
	}
	
	public int getGroundAttack() {
		return this.groundAttack;
	}
	
	public int getAirAttack() {
		return this.airAttack;
	}
	
	public void attack(ChungToc attacked) {
		//ChungToc a = new Scout();
		/* 
		 * this: Chung Toc attacking
		 * if Chung Toc attacked is attacked: ct lost HP/PS by an attack
		 */
		
		if (attacked.moveMode == ChungToc.MoveMode.GROUND) {
			attacked.beAttacked(this.groundAttack); 
		} 
		else if (attacked.moveMode == ChungToc.MoveMode.AIR) {
			attacked.beAttacked(this.airAttack);
		} 
	}
}
