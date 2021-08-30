package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	// verifica se existe uma pe�a do oponente em determinada posi��o
	protected boolean isThereOpponentPiece(Position position) {
		// pega a pe�a da posi��o passada, faz downCast e armazena em p
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		// verifica se a pe�a � diferente de nulo e se sua cor � diferente da cor da sua
		// propria pe�a
		return p != null && p.getColor() != color;
	}

}
