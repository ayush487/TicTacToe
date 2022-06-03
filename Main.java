import java.util.Scanner;
import java.util.HashSet;

class Main {
	public static void main(String[] args){
		Board b = new Board();
		Scanner s = new Scanner(System.in);
		char user = 'X';
		int count = 0;
		HashSet<Character> filled = new HashSet<>();
		boolean validP = true;
		do{
			b.place();
			System.out.print("Type where you want to put your mark!");
			if(count%2==0) user = 'X';
			else user = 'O';
			System.out.println("   Current Player : "+user);
			int i = s.nextInt();
			if(i==1){
				if(filled.add('1')) {
					b.p1=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==2){
				if(filled.add('2')) {
					b.p2=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==3){
				if(filled.add('3')) {
					b.p3=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==4){
				if(filled.add('4')) {
					b.p4=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==5){
				if(filled.add('5')) {
					b.p5=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==6){
				if(filled.add('6')) {
					b.p6=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==7){
				if(filled.add('7')) {
					b.p7=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==8){
				if(filled.add('8')) {
					b.p8=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			else if(i==9){
				if(filled.add('9')) {
					b.p9=user;
				}
				else {
					System.out.println("This point is already used!");
					count--;
				}
			}
			if((b.p1=='X' & b.p2=='X' & b.p3=='X') || (b.p4=='X' & b.p5=='X' & b.p6=='X') || (b.p7=='X' & b.p8=='X' & b.p9=='X')
			|| (b.p1=='X' & b.p4=='X' & b.p7=='X') || (b.p2=='X' & b.p5=='X' & b.p8=='X') || (b.p3=='X' & b.p6=='X' & b.p9=='X')
			|| (b.p1=='X' & b.p5=='X' & b.p9=='X') || (b.p3=='X' & b.p5=='X' & b.p7=='X')){
				b.place();
				System.out.println("Player X wins");
				break;
			}
			else if((b.p1=='O' & b.p2=='O' & b.p3=='O') || (b.p4=='O' & b.p5=='O' & b.p6=='O') || (b.p7=='O' & b.p8=='O' & b.p9=='O') ||
				(b.p1=='O' & b.p4=='O' & b.p7=='O') || (b.p2=='O' & b.p5=='O' & b.p8=='O') || (b.p3=='O' & b.p6=='O' & b.p9=='O') ||
				(b.p1=='O' & b.p5=='O' & b.p9=='O') || (b.p3=='O' & b.p5=='O' & b.p7=='O')){
				b.place();
				System.out.println("Player O wins");
				break;
			}
			else if(filled.size()>=9){
				System.out.println("Match drawn");
				break;
			}
			count++;
		}while(b.gameOver());
	}
}