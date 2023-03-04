package GameDanhTran;

public class AttackPossible implements Strategic {

	@Override
	public int indexAttacked(Team attacker, Team attacked) {
		System.out.println("Attack possible member in team "+ attacked.name +": ");
		int index = attacker.order;
		
		if ((attacker.get(index).attack.getGroundAttack())!=0 &&
				(attacker.get(index).attack.getAirAttack()!=0)){
			AttackRandom r = new AttackRandom();
			return r.indexAttacked(attacker, attacked);
		}
		
		int rand = attacked.size()>1 ? Rand.random(attacked.size()) : 0;
		if (attacker.get(index).attack.getGroundAttack()==0) {
			while(attacked.get(rand).moveMode != ChungToc.MoveMode.AIR){
				rand = attacked.size()>1 ? Rand.random(attacked.size()) : 0;
			}
		}
		else if (attacker.get(index).attack.getAirAttack()==0) {
			while(attacked.get(rand).moveMode != ChungToc.MoveMode.GROUND){
				rand = attacked.size()>1 ? Rand.random(attacked.size()) : 0;
			}
		}
		return rand;
	}

	@Override
	public boolean isValid(Team attacker, Team attacked) {
		return isAttackPossibleValid(attacker, attacked) && isIndexAttackPossibleValid(attacker, attacked);
	}
	
	private boolean isAttackPossibleValid(Team attacker, Team attacked) {
		int countCheck = 0;
		for (int i=0; i<attacker.size(); i++) {
			for (int j=0; j<attacked.size(); j++) {
				/*
				 * If there exists at least one pair that has same moveMode, use this strategy
				 * If not, change randA to other
				 */
				if (attacker.get(i).getMoveMode() != attacked.get(j).getMoveMode()) {
					countCheck++;
				}
			}
		}
		if (countCheck < attacker.size() * attacked.size()) {
			return true;
		}
		return false;
	}
	
	private boolean isIndexAttackPossibleValid(Team attacker, Team attacked){
		int index = attacker.order;
		
		if (attacker.get(index).attack.getGroundAttack()==0) {
			for (int i=0; i<attacked.size(); i++) {
				if (attacked.get(i).moveMode == ChungToc.MoveMode.AIR) {
					return true;
				}
			}
		}
		
		if (attacker.get(index).attack.getAirAttack()==0) {
			for (int i=0; i<attacked.size(); i++) {
				if (attacked.get(i).moveMode == ChungToc.MoveMode.GROUND) {
					return true;
				}
			}
		}

		if (attacker.get(index).attack.getAirAttack()!=0 &&
				attacker.get(index).attack.getGroundAttack()!=0) {
			return true;
		}
		return false;
	}
}
