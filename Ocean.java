import java.util.Scanner;

public class Ocean {
	static Fish[][] ocean = new Fish[100][100];
	public Ocean(Fish[] fishies) {
		int i = 0;
		while(i < fishies.length) {
			int r = (int)(Math.random()*100);
			int c = (int)(Math.random()*100);
			if(ocean[r][c] == null) {
				ocean[r][c] = fishies[i];
				i++;
			}	
		}
	}
	
	public static void play(Fish[][] ocean) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Where would you like to throw? X?: ");
			int row = sc.nextInt();
			System.out.println("Y?: ");
			int col = sc.nextInt();
			ocean[row][col] = new Fish(0, "Hook");
			boolean caught = false;
			while(!caught) {
				
			}			
		}		
	}
	
	public static void move(Fish fish) {
		int row, col;
		for(int r = 0; r < ocean.length; r++) {
			for(int c = 0; c < ocean[r].length; c++) {
				
			}
		}
	}
}
