package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		// matriz temporária criada do mesmo tamanho do tabuleiro e todas as posições
		// com falso
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0); // posiçao auxiliar

		/// ACIMA - marcar como verdadeiro posições possiveis acima da peça
		p.setValues(position.getRow() - 1, position.getColumn());
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		///ESQUERDA - marcar como verdadeiro posições possiveis à esquerda da peça
		p.setValues(position.getRow(), position.getColumn() - 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// DIREITA - marcar como verdadeiro posições possiveis à direita da peça
		p.setValues(position.getRow(), position.getColumn() + 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// ABAIXO - marcar como verdadeiro posições possiveis abaixo da peça
		p.setValues(position.getRow() + 1, position.getColumn());
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1); // andar uma linha pra cima
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// NOROESTE - marcar como verdadeiro posições possiveis acima da peça
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}
		// verificar se posicao existe e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// NORDESTE - marcar como verdadeiro posições possiveis à nordeste da peça
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);
			;
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// SUDESTE - marcar como verdadeiro posições possiveis à sudeste da peça
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		/// SUDOESTE - marcar como verdadeiro posições possiveis sudoeste da peça
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		// enquanto a posiçao existir e não existir peça nela, marca como true
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);
		}
		// verificar se ainda existe uma casa e se a casa possui uma peça adversaria, se
		// sim marcar como verdadeiro
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
