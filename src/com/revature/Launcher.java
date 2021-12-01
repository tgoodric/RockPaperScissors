package com.revature;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void rps(String player1, String player2) {
		//assumes inputs .equalsIgnoreCase() "rock" or "paper" or "scissors"
		
		//force to lower case for consistency
		String p1 = player1.toLowerCase();
		String p2 = player2.toLowerCase();
		
		//compare
		switch(p1) {

			case "rock":{
				if (p2.equals("rock")) {
					System.out.println("TIE");
				}
				else if (p2.equals("scissors")) {
					System.out.println("Player 1 wins");
				}
				else {
					System.out.println("Player 2 wins");
				}
				break;
			}
			case "paper":{
				if (p2.equals("paper")) {
					System.out.println("TIE");
				}
				else if (p2.equals("rock")) {
					System.out.println("Player 1 wins");
				}
				else {
					System.out.println("Player 2 wins");
				}
				break;
			}
			case "scissors":{
				if (p2.equals("scissors")) {
					System.out.println("TIE");
				}
				else if (p2.equals("paper")) {
					System.out.println("Player 1 wins");
				}
				else {
					System.out.println("Player 2 wins");
				}
				break;
			}
		}//end switch

	}// end .rps()

}//end class
