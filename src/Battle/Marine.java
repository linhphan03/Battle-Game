package GameDanhTran;

public class Marine extends Terran {
	
	public Marine() {
		super(80, ChungToc.MoveMode.GROUND, new Attacks(12, 12));
	}
}
