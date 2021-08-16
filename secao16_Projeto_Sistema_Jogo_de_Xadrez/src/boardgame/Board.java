package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board() {
	}

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro na cria�ao do tabuleiro: � necess�rio ao menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posi��o n�o existe no tabuleiro");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posi��o n�o existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("J� existe uma pe�a na posi��o " + position);
		}

		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		// se posi��o n�o existe
		if(!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		// Se pe�a nessa posic�o for nula ela n�o existe
		if (piece(position) == null) {
			return null;
		}
		// removendo a pe�a
		// capturando a pe�a da posi��o em vaiavel auxiliar
		Piece aux = piece(position);
		// setando a posi��o dessa pe�a para nulo
		aux.position = null;
		// colocando nulo na posi��o da matriz onde a pe�a foi retirada
		pieces[position.getRow()][position.getColumn()] = null;
		//retornando a pe�a
		return aux;		
	}

	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return piece(position) != null;
	}

}
