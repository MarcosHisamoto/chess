package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public  abstract class ChessPieces extends Piece {
   
	private Color color;
	
	public ChessPieces(Board board,Color color) {
		super(board);
		this.color = color;
		
	}

	public Color getColor() {
		return color;
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPieces p = (ChessPieces)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}

	


