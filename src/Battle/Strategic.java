package GameDanhTran;

public interface Strategic {
	public int indexAttacked(Team attacker, Team attacked);
	
	public boolean isValid(Team attacker, Team attacked);
	
	public static Strategic random() {
		int rand = Rand.random(4);
		
		switch(rand) {
		case 0:
			return new AttackRandom();
		case 1:
			return new AttackPossible();
		case 2:
			return new AttackLeastHP();
		case 3:
			return new AttackMostDangerous();
		}
		return null;
	}
}
