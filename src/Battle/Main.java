package GameDanhTran;


public class Main {
	public static void main(String[]args) {
		Rand.mode = Rand.MODE.AUTO;
		
		PlayGame game = new PlayGame(1);
		game.printGameInfo();
		System.out.println();
		game.battle();
		
		// TODO class Team { order, members, attack() }
		// TODO interface Attackable { public isValid(), static randomStrat(), attack() } <- AttackRandom, AttackPosible, Attack		
		System.out.println("--------------------------");
		game.checkMember();
		game.result();
		System.out.println((Rand.a).toString());
		
		
	}
}
