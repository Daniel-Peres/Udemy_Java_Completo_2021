package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board() {
	}

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro na criaçao do tabuleiro: é necessário ao menos 1 linha e 1 coluna");
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
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}

		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		// se posição não existe
		if(!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		// Se peça nessa posicão for nula ela não existe
		if (piece(position) == null) {
			return null;
		}
		// removendo a peça
		// capturando a peça da posição em vaiavel auxiliar
		Piece aux = piece(position);
		// setando a posição dessa peça para nulo
		aux.position = null;
		// colocando nulo na posição da matriz onde a peça foi retirada
		pieces[position.getRow()][position.getColumn()] = null;
		//retornando a peça
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
