package main;

public class Day2 {
	
	public void counter() {
		for (int i=1;i<101;i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FosburyFlop");
			}
			else if (i%3==0) {
				System.out.println("Fosbury");
			}
			else if (i%5==0) {
				System.out.println("Flop");
			}
			else {
				System.out.println(i);
			}
		}
			
	}

}
