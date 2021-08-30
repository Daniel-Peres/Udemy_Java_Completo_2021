package chess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Rook;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private Board board;
	private boolean check; // por padrao comeca como false
	private boolean checkMate;

	private List<Piece> piecesOnTheBoard = new ArrayList<>();
	private List<Piece> capturedPieces = new ArrayList<>();

	public ChessMatch() {
		board = new Board(8, 8); // instanciando um tabuleiro
		turn = 1;
		currentPlayer = Color.WHITE;
		initialSetup(); // coloca as peças no tabuleiro em suas devidas posições
	}

	public int getTurn() {
		return turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean getCheck() {
		return check;
	}

	public boolean getCheckMate() {
		return checkMate;
	}

	public ChessPiece[][] getPieces() { // fazendo downCast do tipo Piece para o tipo ChessPiece
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; // matriz auxiliar com o tamanho do
																					// tabuleiro
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat; // retornando a matriz de peças agora com o tipo ChessPiece
	}

	public boolean[][] possibleMoves(ChessPosition sourcePosition) {

		Position position = sourcePosition.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}

	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		validateTargetPosition(source, target);
		Piece capturedPiece = makeMove(source, target);

		if (testeCheck(currentPlayer)) {
			undoMove(source, target, capturedPiece);
			throw new ChessException("Voce nao pode se colocar em Check");
		}

		check = (testeCheck(opponent(currentPlayer))) ? true : false;

		if (testeCheckMate(opponent(currentPlayer))) {
			checkMate = true;
		} else {
			nextTurn();
		}
		return (ChessPiece) capturedPiece;
	}

	private Piece makeMove(Position source, Position target) {
		ChessPiece p = (ChessPiece) board.removePiece(source);// removendo a peça na posição de origem
		p.increaseMoveCount();
		Piece capturedPiece = board.removePiece(target);// capturando uma possivel peça na posição de destino
		board.placePiece(p, target);// colocar a peça que estava na origem na posição de destino

		if (capturedPiece != null) { // se a peca capturada existir
			piecesOnTheBoard.remove(capturedPiece); // remove a peca do tabuleiro e
			capturedPieces.add(capturedPiece); // adiciona a peca em pecas capturadas
		}

		return capturedPiece;// retornar a peça capturada
	}

	private void undoMove(Position source, Position target, Piece capturedPiece) {
		ChessPiece p = (ChessPiece)board.removePiece(target); // remove a peça do local de destino e armazena em p
		p.decreaseMoveCount();
		board.placePiece(p, source); // coloca a peça de volta no local de origem

		if (capturedPiece != null) { // se peca capturada for diferente de null
			board.placePiece(capturedPiece, target); // devolve a peca capturada ao local original dela
			capturedPieces.remove(capturedPiece); // remove a peca da lista de capturadas
			piecesOnTheBoard.add(capturedPiece); // devolve a peca na lista de pecas do tabuleiro
		}
	}

	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("Nao existe peca na posicao de origem");
		}
		if (currentPlayer != ((ChessPiece) board.piece(position)).getColor()) {
			throw new ChessException("A peca escolhida nao e sua !!!");
		}

		if (!board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("Nao existe movimentos possiveis para a peca escolhida");
		}
	}

	private void validateTargetPosition(Position source, Position target) {
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("A peca escolhida nao pode ser movida para a posicao de destino");
		}
	}

	private void nextTurn() {
		turn++;
		currentPlayer = currentPlayer == Color.WHITE ? Color.BLACK : Color.WHITE;
	}

	private Color opponent(Color color) { // metodo devolve o opponente de uma cor
		return (color == Color.WHITE) ? Color.BLACK : Color.WHITE;
	}

	private ChessPiece king(Color color) {
		// cria uma lista com todoas as pecas da cor passada como argumento
		List<Piece> list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece) x).getColor() == color)
				.collect(Collectors.toList());
		// percorre a lista e retorna toda peca que for uma instancia de King
		for (Piece p : list) {
			if (p instanceof King) {
				return (ChessPiece) p;
			}
		}
		// se nao encontrar, lanca uma excessao (na verdade excessao impossivel pois se
		// nao existir rei o jogo acabou)
		throw new IllegalStateException("Nao existe um Rei dessa cor no tabuleiro");

	}

	private boolean testeCheck(Color color) {
		// pegando a posicao do rei em formato de matriz
		Position kingPosition = king(color).getChessPosition().toPosition();
		// cria uma lista com as pecas do tabuleiro que pertencem a cor do oponente
		List<Piece> opponentPieces = piecesOnTheBoard.stream()
				.filter(x -> ((ChessPiece) x).getColor() == opponent(color)).collect(Collectors.toList());
		// percorre a lista de pecas do openente
		for (Piece p : opponentPieces) {
			// cria uma matriz com os movimentos possiveis do opponente
			boolean[][] mat = p.possibleMoves();
			// verifica se alguma posicao da matriz bate com a posicao do Rei e retorna true
			if (mat[kingPosition.getRow()][kingPosition.getColumn()]) {
				return true;
			}
		}
		// se nenhuma posicao bater retorna false
		return false;
	}

	private boolean testeCheckMate(Color color) {
		if (!testeCheck(color)) {
			return false;
		}
		List<Piece> list = list = piecesOnTheBoard.stream().filter(x -> ((ChessPiece) x).getColor() == color)
				.collect(Collectors.toList());
		for (Piece p : list) {
			boolean[][] mat = p.possibleMoves();
			for (int i = 0; i < board.getRows(); i++) {
				for (int j = 0; j < board.getColumns(); j++) {
					if (mat[i][j]) {
						Position source = ((ChessPiece) p).getChessPosition().toPosition();
						Position target = new Position(i, j);
						Piece capturedPiece = makeMove(source, target);
						boolean testCheck = testeCheck(color);
						undoMove(source, target, capturedPiece);
						if (!testCheck) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		piecesOnTheBoard.add(piece);
	}

	private void initialSetup() {
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('a', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('b', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('c', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('d', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('e', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('f', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('g', 2, new Pawn(board, Color.WHITE));
		placeNewPiece('h', 2, new Pawn(board, Color.WHITE));
		
		placeNewPiece('a', 8, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('h', 8, new Rook(board, Color.BLACK));
		placeNewPiece('a', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('b', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('c', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('d', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('e', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('f', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('g', 7, new Pawn(board, Color.BLACK));
		placeNewPiece('h', 7, new Pawn(board, Color.BLACK));
	}

}
