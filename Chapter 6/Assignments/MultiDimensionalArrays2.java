public class MultiDimensionalArrays2{
	public static void main (String [] args){
		int [][] numbers = {{3,4,5},{4,5,6},{8,9,0}};
		
		int row = 0;
		
		for(int [] array : numbers){
			
			int col = 0;
			
			for(int element : array){
				
				System.out.printf("Elements at index [%d] [%d] = %d%n", row, col, element);
				
				col++;
			}
			row++;
		}				
	}
}
