package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPieces;
import chess.ChessPosition;


public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			
		
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("source:");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPieces capturedPiece = chessMatch.performChessMove(source, target);
	  } 
	}
}
