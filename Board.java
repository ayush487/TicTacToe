class Board {
	char p1 = '1';
	char p2 = '2';
	char p3 = '3';
	char p4 = '4';
	char p5 = '5';
	char p6 = '6';
	char p7 = '7';
	char p8 = '8';
	char p9 = '9';
	public void place(){
		System.out.println("    |   |   ");
		System.out.println("  "+p1+" | "+p2+" | "+p3);
		System.out.println("    |   |   ");
		System.out.println("--------------");
		System.out.println("    |   |   ");
		System.out.println("  "+p4+" | "+p5+" | "+p6);
		System.out.println("    |   |   ");
		System.out.println("--------------");
		System.out.println("    |   |   ");
		System.out.println("  "+ p7+" | "+p8+" | "+p9);
		System.out.println("    |   |   ");
	}
	public boolean gameOver(){
		return true;
	}
}