package GameDanhTran;

public class AttackRandom implements Strategic {

	@Override
	public int indexAttacked(Team attacker, Team attacked) {
		System.out.println("Attack random member in team "+ attacked.name +": ");
		int rand = attacked.size()>1 ? Rand.random(attacked.size()) : 0;
		return rand;
	}

	@Override
	public boolean isValid(Team attacker, Team attacked) {
		return true;
	}
}
