package GameDanhTran;

public class AttackMostDangerous implements Strategic{
	private int[] highestAttackInTeam(Team attacked) {
		/*
		 * First element in list: index of member with highest total attack
		 * Second element in list: highest total attack
		 */
		
		int[]indexAndAttack = {0, Integer.MIN_VALUE};
		for (int i=0; i<attacked.size(); i++) {
			if (attacked.get(i).getTotalAttack()>indexAndAttack[1]) {
				indexAndAttack[0] = i;
				indexAndAttack[1] = attacked.get(i).getHP();
			}
		}
		return indexAndAttack;
	}
	
	// strategy 4	
	@Override
	public int indexAttacked(Team attacker, Team attacked) {
		System.out.println("Attack most dangerous member in team "+ attacked.name +": ");
		int highestAttackIndex = highestAttackInTeam(attacked)[0];
		int highestAttack = highestAttackInTeam(attacked)[1];
			
		System.out.println("Member with highest attack: " + attacked.get(highestAttackIndex) + "(" + highestAttack + ")");
		return highestAttackIndex;
	}

	@Override
	public boolean isValid(Team attacker, Team attacked) {
		return true;
	}
	
}
