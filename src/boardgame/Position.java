package boardgame;

public class Position {
	private int row;
	private int column;
	
	// Construtor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// Get e set
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	// ToString - retorna posição Y e X
	@Override
	public String toString() {
		return row + "; " + column;
	}
	
}
