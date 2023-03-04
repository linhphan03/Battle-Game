package GameDanhTran;

import java.util.ArrayList;

public class Team {
	//Attack
	protected int order = 0;
	protected String name;
	private ArrayList<ChungToc> members = new ArrayList<ChungToc>();
	
	public Team(ChungToc.Type type, int n, String name) {
		this.name = name;
		for (int i=0; i<n; i++) {
			this.members.add(type == ChungToc.Type.TERRAN ? Terran.spawn() : Protoss.spawn());
		}
	}
	
	public int size() {
		return this.members.size();
	}
	
	public ChungToc get(int i) {
		return this.members.get(i);
	}
	
	private void attackReport(Team attacker, Team attacked, Strategic strategy) {
		int indexTarget = strategy.indexAttacked(attacker, attacked);

		ChungToc memberA = attacker.get(attacker.order);
		ChungToc memberB = attacked.get(indexTarget);
		
		String report = memberA.toString() + " attacks " + memberB.toString() + " --> ";
		
		this.get(order).attack.attack(attacked.get(indexTarget));
		attacked.removeMember(indexTarget);
		
		report += memberB.toString();
		System.out.println(report);
	}
	
	public void attack(Team targetTeam) {
		if (this.order >= this.members.size()) {
			this.order = 0;
		}
		
		Strategic strategy = Strategic.random();
		
		while (!strategy.isValid(this, targetTeam)) {
			strategy = Strategic.random();
		}
		
		attackReport(this, targetTeam, strategy);
		this.order++;
	}
	
	public void removeMember(int index) {
		if (!this.get(index).isAlive()) {
			this.members.remove(index);
		}
	}
	
	public String toString() {
		String res = "";
		for (ChungToc c: this.members) {
			res += "\n" + c;
		}
		return res;
	}
}
