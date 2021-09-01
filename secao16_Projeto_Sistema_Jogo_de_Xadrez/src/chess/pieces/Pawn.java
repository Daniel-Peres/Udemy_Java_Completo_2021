package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;

	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public boolean[][] possibleMoves() {
		// Matriz auxiliar
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// posiçao auxiliar
		Position p = new Position(0, 0);

		if (getColor() == Color.WHITE) {
			// verificando se o movimento é possivel uma posicao acima
			p.setValues(position.getRow() - 1, position.getColumn());
			// verifica se a posicao existe e nao existe peca nela
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificando se o movimento é possivel duas posicoes acima
			p.setValues(position.getRow() - 2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			// verifica se a posicao existe, se nao existe pecas a frente e se e o primeiro
			// movimento dessa peca
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificar movimento possivel na diagonal esquerda caso haja peca adversaria
			p.setValues(position.getRow() - 1, position.getColumn() - 1);
			// verifica se posicao existe e se existe peca adversaria na posicao
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificar movimento possivel na diagonal direita caso haja peca adversaria
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			// verifica se posicao existe e se existe peca adversaria na posicao
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// # specialMove en passant
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() - 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() - 1][right.getColumn()] = true;
				}
			}

		} else {
			// verificando se o movimento é possivel uma posicao acima
			p.setValues(position.getRow() + 1, position.getColumn());
			// verifica se a posicao existe e nao existe peca nela
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificando se o movimento é possivel duas posicoes acima
			p.setValues(position.getRow() + 2, position.getColumn());
			Position p2 = new Position(position.getRow() + 1, position.getColumn());
			// verifica se a posicao existe, se nao existe pecas a frente e se e o primeiro
			// movimento dessa peca
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2)
					&& !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificar movimento possivel na diagonal esquerda caso haja peca adversaria
			p.setValues(position.getRow() + 1, position.getColumn() - 1);
			// verifica se posicao existe e se existe peca adversaria na posicao
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// verificar movimento possivel na diagonal direita caso haja peca adversaria
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			// verifica se posicao existe e se existe peca adversaria na posicao
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			// # specialMove en passant
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() + 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() + 1][right.getColumn()] = true;
				}
			}

		}

		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}

}
