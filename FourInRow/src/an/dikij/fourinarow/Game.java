package an.dikij.fourinarow;

public class Game {
	private static final int COLUMNS = 7;
	private static final int ROWS = 6;
	private int[][] board;

	public Game() {
		board = new int[ROWS][COLUMNS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				board[i][j] = 0;
			}
		}
	}

}
