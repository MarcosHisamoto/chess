package chess.pieces;

import boardgame.Board;
import chess.ChessPieces;
import chess.Color;

public class Rook extends ChessPieces {

	public Rook(Board board, Color color) {
		super(board, color);
		
	
	}
	
	@Override
	public String toString() {
		return "R";
		
	}

}
