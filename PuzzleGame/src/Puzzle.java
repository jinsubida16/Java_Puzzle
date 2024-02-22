import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Puzzle extends Application{
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage ps) {
		GridPane root = new GridPane();
		Label l1 = new Label("1");
		Label l2 = new Label("2");
		Label l3 = new Label("3");
		Label l4 = new Label("4");
		Label l5 = new Label("5");
		Label l6 = new Label("6");
		Label l7 = new Label("7");
		Label l8 = new Label("8");
		Label l0 = new Label("0");

		l1.setMinSize(50, 50);
		l1.setPadding(new Insets(25));
		l1.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l2.setMinSize(50, 50);
		l2.setPadding(new Insets(25));
		l2.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l3.setMinSize(50, 50);
		l3.setPadding(new Insets(25));
		l3.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l4.setMinSize(50, 50);
		l4.setPadding(new Insets(25));
		l4.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l5.setMinSize(50, 50);
		l5.setPadding(new Insets(25));
		l5.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l6.setMinSize(50, 50);
		l6.setPadding(new Insets(25));
		l6.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l7.setMinSize(50, 50);
		l7.setPadding(new Insets(25));
		l7.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l8.setMinSize(50, 50);
		l8.setPadding(new Insets(25));
		l8.setStyle("-fx-background-color:lightblue; -fx-font-family:Verdana; -fx-font-size:20;");
		l0.setMinSize(50, 50);
		l0.setPadding(new Insets(25));
		l0.setStyle("-fx-background-color:white; -fx-font-family:Verdana; -fx-font-size:20;");

		l1.setOnMouseClicked(e->{
			int prevColl1 = GridPane.getColumnIndex(l1);
			int prevRowl1 = GridPane.getRowIndex(l1);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl1 - prevRowl0;
			int diffCol = prevColl1 - prevColl0;

			System.out.println("L1 Row: " + prevRowl1);
			System.out.println("L1 Column: " + prevColl1);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl1==prevColl0||prevRowl1==prevRowl0){
				if (Math.abs(prevColl1 - prevColl0) == 1||Math.abs(prevRowl1 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl1);
					GridPane.setRowIndex(l0, prevRowl1);
					GridPane.setColumnIndex(l1, prevColl0);
					GridPane.setRowIndex(l1, prevRowl0);
				}
			}		
		});

		l2.setOnMouseClicked(e->{
			int prevColl2 = GridPane.getColumnIndex(l2);
			int prevRowl2 = GridPane.getRowIndex(l2);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl2 - prevRowl0;
			int diffCol = prevColl2 - prevColl0;

			System.out.println("L2 Row: " + prevRowl2);
			System.out.println("L2 Column: " + prevColl2);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );
			

			if(prevColl2==prevColl0||prevRowl2==prevRowl0){
				if (Math.abs(prevColl2 - prevColl0) == 1||Math.abs(prevRowl2 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl2);
					GridPane.setRowIndex(l0, prevRowl2);
					GridPane.setColumnIndex(l2, prevColl0);
					GridPane.setRowIndex(l2, prevRowl0);
				}
			}		
		});

		l3.setOnMouseClicked(e->{
			int prevColl3 = GridPane.getColumnIndex(l3);
			int prevRowl3 = GridPane.getRowIndex(l3);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl3 - prevRowl0;
			int diffCol = prevColl3 - prevColl0;

			System.out.println("L3 Row: " + prevRowl3);
			System.out.println("L3 Column: " + prevColl3);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl3==prevColl0||prevRowl3==prevRowl0){
				if (Math.abs(prevColl3 - prevColl0) == 1||Math.abs(prevRowl3 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl3);
					GridPane.setRowIndex(l0, prevRowl3);
					GridPane.setColumnIndex(l3, prevColl0);
					GridPane.setRowIndex(l3, prevRowl0);
				}
			}		
		});

		l4.setOnMouseClicked(e->{
			int prevColl4 = GridPane.getColumnIndex(l4);
			int prevRowl4 = GridPane.getRowIndex(l4);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl4 - prevRowl0;
			int diffCol = prevColl4 - prevColl0;

			System.out.println("L4 Row: " + prevRowl4);
			System.out.println("L4 Column: " + prevColl4);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl4==prevColl0||prevRowl4==prevRowl0){
			if (Math.abs(prevColl4 - prevColl0) == 1||Math.abs(prevRowl4 - prevRowl0) == 1){
				
				GridPane.setColumnIndex(l0, prevColl4);
				GridPane.setRowIndex(l0, prevRowl4);
				GridPane.setColumnIndex(l4, prevColl0);
				GridPane.setRowIndex(l4, prevRowl0);
				}
			}		
		});

		l5.setOnMouseClicked(e->{
			int prevColl5 = GridPane.getColumnIndex(l5);
			int prevRowl5 = GridPane.getRowIndex(l5);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl5 - prevRowl0;
			int diffCol = prevColl5 - prevColl0;

			System.out.println("L5 Row: " + prevRowl5);
			System.out.println("L5 Column: " + prevColl5);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl5==prevColl0||prevRowl5==prevRowl0){
				if (Math.abs(prevColl5 - prevColl0) == 1||Math.abs(prevRowl5 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl5);
					GridPane.setRowIndex(l0, prevRowl5);
					GridPane.setColumnIndex(l5, prevColl0);
					GridPane.setRowIndex(l5, prevRowl0);
				}
			}		
		});

		l6.setOnMouseClicked(e->{
			int prevColl6 = GridPane.getColumnIndex(l6);
			int prevRowl6 = GridPane.getRowIndex(l6);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl6 - prevRowl0;
			int diffCol = prevColl6 - prevColl0;

			System.out.println("L6 Row: " + prevRowl6);
			System.out.println("L6 Column: " + prevColl6);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl6==prevColl0||prevRowl6==prevRowl0){
				if (Math.abs(prevColl6 - prevColl0) == 1||Math.abs(prevRowl6 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl6);
					GridPane.setRowIndex(l0, prevRowl6);
					GridPane.setColumnIndex(l6, prevColl0);
					GridPane.setRowIndex(l6, prevRowl0);
				}
			}
		});

		l7.setOnMouseClicked(e->{
			int prevColl7 = GridPane.getColumnIndex(l7);
			int prevRowl7 = GridPane.getRowIndex(l7);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl7 - prevRowl0;
			int diffCol = prevColl7 - prevColl0;

			System.out.println("L7 Row: " + prevRowl7);
			System.out.println("L7 Column: " + prevColl7);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl7==prevColl0||prevRowl7==prevRowl0){
				if (Math.abs(prevColl7 - prevColl0) == 1||Math.abs(prevRowl7 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl7);
					GridPane.setRowIndex(l0, prevRowl7);
					GridPane.setColumnIndex(l7, prevColl0);
					GridPane.setRowIndex(l7, prevRowl0);
				}
			}		
		});

		l8.setOnMouseClicked(e->{
			int prevColl8 = GridPane.getColumnIndex(l8);
			int prevRowl8 = GridPane.getRowIndex(l8);
			int prevColl0 = GridPane.getColumnIndex(l0);
			int prevRowl0 = GridPane.getRowIndex(l0);
			int diffRow = prevRowl8 - prevRowl0;
			int diffCol = prevColl8 - prevColl0;

			System.out.println("L8 Row: " + prevRowl8);
			System.out.println("L8 Column: " + prevColl8);
			System.out.println("L0 Row: " + prevRowl0);
			System.out.println("L0 Column: " + prevColl0);
			System.out.println("Row Difference: " + diffRow );
			System.out.println("Column Difference: " + diffCol );

			if(prevColl8==prevColl0||prevRowl8==prevRowl0){
				if (Math.abs(prevColl8 - prevColl0) == 1||Math.abs(prevRowl8 - prevRowl0) == 1){
				
					GridPane.setColumnIndex(l0, prevColl8);
					GridPane.setRowIndex(l0, prevRowl8);
					GridPane.setColumnIndex(l8, prevColl0);
					GridPane.setRowIndex(l8, prevRowl0);
				}
			}
		});

		root.add(l1, 0, 0);
		root.add(l2, 1, 0);
		root.add(l3, 2, 0);
		root.add(l4, 0, 1);
		root.add(l5, 1, 1);
		root.add(l6, 2, 1);
		root.add(l7, 0, 2);
		root.add(l8, 1, 2);
		root.add(l0, 2, 2);

		root.setAlignment(Pos.CENTER);
		root.getVgap(); root.setVgap(5);
		root.getHgap(); root.setHgap(5);

		Scene s = new Scene(root, 300, 300);
		ps.setTitle("Puzzle UI");
		ps.setScene(s);
		ps.show();
	}
}
