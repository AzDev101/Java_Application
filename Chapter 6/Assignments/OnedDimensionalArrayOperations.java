public class OnedDimensionalArrayOperations{ 
	public static void main(String[] args){
		
		// A) Setting Array Elements to Zero
		
		int[] counts = new int[10];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}

		// B) Incrementing Array Elements

		int[] bonus = new int[15];
		for (int i = 0; i < bonus.length; i++) {
			bonus[i]++;
		}

		// C) Displaying Array Elements

		int[] bestScores = {10, 20, 30, 40, 50};
		for (int score : bestScores) {
			System.out.println(score);	
		}
	}
}