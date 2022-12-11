package Model;

import java.util.ArrayList;
import java.util.Timer;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;


/**
 * Data structure for managing interaction with a board.
 */
public class Board {
	GridPane chessBoard;
	String theme;
	public ArrayList<Cell> cells = new ArrayList<>();

	public Board(GridPane chessBoard, String theme){
		this.chessBoard = chessBoard;
		this.theme = theme;

		makeBoard(this.chessBoard, theme);
	}


	private void makeBoard(GridPane chessBoard, String theme){
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				Cell cell = new Cell(i,j);
				cell.setName("Cell" + i + j);
				cell.setPrefHeight(100);
				cell.setPrefWidth(100);
				cell.setBorder(new Border(new BorderStroke(Color.BLACK,
						BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
				setTheme(cell, theme, i, j);
				chessBoard.add(cell, i, j, 1, 1);
				cells.add(cell);
			}
		}
		addPieces();
	}

	private void setTheme(Cell cell, String theme, int i, int j){
		Color color1 = Color.web("#ffffff00");
		Color color2 = Color.web("#ffffff00");

		switch (theme) {
		case "Coral": 
			color1 = Color.web("#b1e4b9");
			color2 = Color.web("#70a2a3");
			break;

		case "Dusk": {
			color1 = Color.web("#cbb7ae");
			color2 = Color.web("#716677");
		}
		case "Wheat": {
			color1 = Color.web("#eaefce");
			color2 = Color.web("#bbbe65");
		}
		case "Marine": {
			color1 = Color.web("#9dacff");
			color2 = Color.web("#6f74d2");
		}
		case "Emerald": {
			color1 = Color.web("#adbd90");
			color2 = Color.web("#6e8f72");
		}
		case "Sandcastle": {
			color1 = Color.web("#e4c16f");
			color2 = Color.web("#b88b4a");
		}
		}

		if((i+j)%2==0){
			cell.setBackground(new Background(new BackgroundFill(color1, CornerRadii.EMPTY, Insets.EMPTY)));
		}else{
			cell.setBackground(new Background(new BackgroundFill(color2, CornerRadii.EMPTY, Insets.EMPTY)));
		}

	}

	private void addPiece(Cell cell, Piece piece){
		cell.getChildren().add(piece);
		cell.occupied = true;
	}

	private void addPieces(){
		for(Cell cell : cells){
			if(cell.occupied) continue;

			else if(cell.y == 0){
				if(cell.x == 7){
					addPiece(cell, new Queen("white", cell.x, cell.y));
				}
				if(cell.x == 0){
					addPiece(cell, new Knight("black", cell.x, cell.y));
				}
			}
		}
	}

}
