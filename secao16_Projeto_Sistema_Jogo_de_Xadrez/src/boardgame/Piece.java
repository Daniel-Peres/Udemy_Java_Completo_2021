package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // protected pq � s� da camada de tabuleiro
		return board;
	}

	// verifica em toda a matriz do tabileiro se h� movimentos poss�veis, de acordo com cada tipo de pe�a
	// ser� implementada na classe de cada pe�a
	public abstract boolean[][] possibleMoves();

	// verifica se existe movimento possivel para a pe�a existente na posi��o passada como argumento
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	// percorre toda a matriz do tabuleiro e diz se existe movimento possivel 
	public boolean isThereAnyPossibleMove() {
		// matriz auxiliar recebe a matriz com todos os movimentos possiveis e impossiveis de determinada pe�a
		boolean[][] mat = possibleMoves();
		// percorre a matriz verificando se h� ao meos um movimento poss�vel
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
