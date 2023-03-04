package GameDanhTran;

import java.util.ArrayList;

public class Rand {
	enum MODE { STATIC, AUTO }
	static MODE mode = MODE.AUTO;
	static private int[] predefined = {0,1,2,3,0,1,2,3,0,1,2,3,0,1,2,3,0,1,2,3};

	static private int cursor = 0;
	static public ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static int random(int n) {
		if (mode == MODE.AUTO) {
			int x = (int)(Math.random() * n);
			a.add(x);
			return x;
		}
		return predefined[cursor++];
	}
}
