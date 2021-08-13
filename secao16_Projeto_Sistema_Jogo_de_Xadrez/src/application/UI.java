package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) { // imprimir tabuleiro

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " "); // imprime numero lateral esquerdo com espa�o
			
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]); // imprime pecas dispostas no tabuleiro
			}
			
			System.out.println(); // quebra de linha
		}
		
		System.out.println("  a b c d e f g h"); // imprime rodap� do tabuleiro

	}

	private static void printPiece(ChessPiece piece) { // imprimir uma unica peca

		if (piece == null) { // se peca nula imprime tra�o
			System.out.print("-");
		} else { // sen�o imprime pe�a
			System.out.print(piece);
		}
		System.out.print(" "); // imprime espa�o em branco ap�s a pe�a
	}

}
