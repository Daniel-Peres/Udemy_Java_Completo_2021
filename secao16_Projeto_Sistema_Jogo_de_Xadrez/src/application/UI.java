package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");

	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) { // se peca nula imprime tra�o
			System.out.print("-");
		} else { // sen�o imprime pe�a
			System.out.print(piece);
		}
		System.out.print(" "); // imprime espa�o em branco ap�s a pe�a
	}

}
