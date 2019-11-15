import java.util.Arrays;


public class MultidimensionalArrays {

	
	public static void main(String[] args) {
		int[][] grid;	
		grid = new int[4][4];		
		
		int[] row = grid[0];
		String row1Content = Arrays.toString(row);
		System.out.println(row1Content);		
		System.out.println(grid[3][3]);		
		System.out.println("Init in line");
		
		int[][] table = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};		
		
		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));			
		}		System.out.println("assign value to specific cell");
		
		table[2][0] = 1;
		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));			
		}		
		
		System.out.println("Replace a row in 2-dim array");
		
		int[] specialRow = {1,1,1};		
		table[1] = specialRow;
		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));		
		
	}
		System.out.println("String 2-dim array");
		String[][] content = new String[4][4];
		for(String[] arrayRow : content){
			System.out.println(Arrays.toString(arrayRow));
		}
			
			
		}
}

