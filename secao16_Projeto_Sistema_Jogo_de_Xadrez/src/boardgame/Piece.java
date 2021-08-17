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

	protected Board getBoard() { // protected pq é só da camada de tabuleiro
		return board;
	}

	// verifica em toda a matriz do tabileiro se há movimentos possíveis, de acordo com cada tipo de peça
	// será implementada na classe de cada peça
	public abstract boolean[][] possibleMoves();

	// verifica se existe movimento possivel para a peça existente na posição passada como argumento
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	// percorre toda a matriz do tabuleiro e diz se existe movimento possivel 
	public boolean isThereAnyPossibleMove() {
		// matriz auxiliar recebe a matriz com todos os movimentos possiveis e impossiveis de determinada peça
		boolean[][] mat = possibleMoves();
		// percorre a matriz verificando se há ao meos um movimento possível
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
