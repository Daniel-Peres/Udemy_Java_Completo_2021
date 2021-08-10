package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

	public ChessMatch() { // a classe partida de xadrez instancia um tabuleiro com seu tamanho em seu construtor
		board = new Board(8, 8);
	}

	public ChessPiece[][] getPieces() {  // fazendo downCast nas do tipo pe�a pra pe�as de xadrez
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat; //retornando a matriz de pe�as agora com o tipo ChessPiece
	}

}
