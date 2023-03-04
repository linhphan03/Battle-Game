package GameDanhTran;

public class AttackLeastHP implements Strategic{
	
	private int[] leastHPInTeam(Team attacked) {
		/*
		 * First element in list: index of member with lowest HP
		 * Second element in list: lowest HP
		 */
		
		int[]indexAndHP = {0, Integer.MAX_VALUE};
		for (int i=0; i<attacked.size(); i++) {
			if (attacked.get(i).getHP()<indexAndHP[1]) {
				indexAndHP[0] = i;
				indexAndHP[1] = attacked.get(i).getHP();
			}
		}
		return indexAndHP;
	}

	@Override
	public int indexAttacked(Team attacker, Team attacked) {
		System.out.println("Attack member with least HP in team "+ attacked.name +": ");
		int leastHPIndex = leastHPInTeam(attacked)[0];
		int lowestHP = leastHPInTeam(attacked)[1];
		
		System.out.println("Member with least HP: " + attacked.get(leastHPIndex) + "(" + lowestHP + ")");	
		return leastHPIndex;
	}

	@Override
	public boolean isValid(Team attacker, Team attacked) {
		return true;
	}
}
