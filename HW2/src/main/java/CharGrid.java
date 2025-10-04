// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
            int res_Row = 0;
            int res_Col = 0;
            int rowMin = 1000;
            int rowMax = 0;
            int colMin = 1000;
            int colMax = 0;
            for(int i = 0;i< grid.length;i++){ //rows
                for(int j = 0;j<grid[0].length;j++){ //cols
                    if(grid[i][j] == ch){
                        rowMax = Math.max(rowMax,i);
                        rowMin = Math.min(rowMin,i);
                        colMax = Math.max(colMax,j);
                        colMin = Math.min(colMin,j);
                    }
                }
            }
            res_Row = rowMax - rowMin + 1;
            res_Col = colMax -colMin + 1;

		return res_Col * res_Row; // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		return 0; // YOUR CODE HERE
	}
	
}
