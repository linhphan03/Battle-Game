package GameDanhTran;

public class PlayGame {
	private Team teamA;
	private Team teamB;

	
	public Team getTeamA() {
		return teamA;
	}

	public Team getTeamB() {
		return teamB;
	}

	public PlayGame (int n) {
		teamA = new Team(ChungToc.Type.TERRAN, n, "A");
		teamB = new Team(ChungToc.Type.PROTOSS, n, "B");
	}
	
	public void printGameInfo() {
		System.out.println("Team A: ");
		for (int i=0; i<teamA.size(); i++) {
			System.out.println(teamA.get(i).toString());
		}
		
		System.out.println();
		
		System.out.println("Team B: ");
		for (int i=0; i<teamB.size(); i++) {
			System.out.println(teamB.get(i).toString());
		}
	}
	
	public void battle() {
		int round = 1;
		while (teamA.size()>0 && teamB.size()>0) {
			System.out.println("--------------------------");
			System.out.println("ROUND " + (round));
			
			teamA.attack(teamB);
			System.out.println("\nCHECK MEMBER AFTER TEAM A'S ATTACK: ");
			checkMember();
			
			if (teamB.size()==0) {
				break;
			}
			teamB.attack(teamA);
			System.out.println("\nCHECK MEMBER AFTER TEAM B'S ATTACK: ");
			checkMember();
			
			round++;
		}
	}
	
	public void checkMember() {
		System.out.println("Team A: " + teamA.toString());
		System.out.println("Team B: " + teamB.toString());
	}
	
	public void result() {
		if (teamA.size()==0) {
			System.out.println("RESULT: TEAM B WON!!!");
		}
		else {
			System.out.println("RESULT: TEAM A WON!!!");
		}
	}
}

