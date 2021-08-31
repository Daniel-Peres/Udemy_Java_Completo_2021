package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] possibleMoves() {
		// matriz tempor�ria criada do mesmo tamanho do tabuleiro e todas as posi��es
		// com falso
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0); // posi�ao auxiliar

		// ACIMA - marcar como verdadeiro posi��es possiveis acima da pe�a
		p.setValues(position.getRow() - 1, position.getColumn());
		// enquanto a posi�ao existir e n�o existir pe�a nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma pe�a adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// ESQUERDA - marcar como verdadeiro posi��es possiveis � esquerda da pe�a
		p.setValues(position.getRow(), position.getColumn() - 1);
		// enquanto a posi�ao existir e n�o existir pe�a nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma pe�a adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// DIREITA - marcar como verdadeiro posi��es possiveis � direita da pe�a
		p.setValues(position.getRow(), position.getColumn() + 1);
		// enquanto a posi�ao existir e n�o existir pe�a nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma pe�a adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// ABAIXO - marcar como verdadeiro posi��es possiveis abaixo da pe�a
		p.setValues(position.getRow() + 1, position.getColumn());
		// enquanto a posi�ao existir e n�o existir pe�a nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma pe�a adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
