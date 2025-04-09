public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int searchMazeMoves(String[][] arr1) {
		int row = arr1.length - 1;
		int col = 0;
		int moves = 0;
		int result = searchMazeMovesHelper(arr1, row, col, moves);
		
		if (result == Integer.MAX_VALUE) {
			return -1;
		} else {
			return result;
		}
	}

	public static int searchMazeMovesHelper(String[][] arr1, int row, int col, int moves) {
		int rows = arr1.length;
		int cols = arr1[0].length;

		if (row < 0 || row >= rows || col < 0 || col >= cols || arr1[row][col] == "*") {
			return Integer.MAX_VALUE;
		} 

		if (arr1[row][col].equals("F")) {
			return moves;
		}

		int right = searchMazeMovesHelper(arr1, row, col + 1, moves + 1);
		int up = searchMazeMovesHelper(arr1, row - 1, col, moves + 1);

		int min = Math.min(right, up);

		return min;

	}



	public static int noOfPaths(String[][] arr2) {
		int row = arr2.length - 1;
		int col = 0;
		return noOfPathsHelper(arr2, row, col);
	}

	public static int noOfPathsHelper(String[][] arr2, int row, int col) {
		int rows = arr2.length;
		int cols = arr2[0].length;

		if (row < 0 || row >= rows || col < 0 || col >= cols || arr2[row][col] == "*") {
			return 0;
		} 

		if (arr2[row][col].equals("F")) {
			return 1;
		}

		int up = noOfPathsHelper(arr2, row - 1, col);
		int right = noOfPathsHelper(arr2, row, col + 1);

		return up + right;

	}

	
}
