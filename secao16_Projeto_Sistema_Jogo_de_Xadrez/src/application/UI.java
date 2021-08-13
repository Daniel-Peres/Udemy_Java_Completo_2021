package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) { // imprimir tabuleiro

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " "); // imprime numero lateral esquerdo com espaço
			
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]); // imprime pecas dispostas no tabuleiro
			}
			
			System.out.println(); // quebra de linha
		}
		
		System.out.println("  a b c d e f g h"); // imprime rodapé do tabuleiro

	}

	private static void printPiece(ChessPiece piece) { // imprimir uma unica peca

		if (piece == null) { // se peca nula imprime traço
			System.out.print("-");
		} else { // senão imprime peça
			System.out.print(piece);
		}
		System.out.print(" "); // imprime espaço em branco após a peça
	}

}
