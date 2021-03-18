import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import java.io.*;
import javafx.event.*;
import javafx.scene.control.*; 
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.image.*;
import javafx.geometry.*; 

public class TicTacToe extends Application {
	public int turn =1;
	public int rturn=1;
	public int Point[][]=new int[3][3];
	public int Player1win() {
		if(Point[0][0]==1 && Point[0][1]==1 && Point[0][2]==1)
		{
			return 1;
		}
		else if(Point[1][0]==1 && Point[1][1]==1 && Point[1][2]==1)
		{
			return 1;
		}
		else if(Point[2][0]==1 && Point[2][1]==1 && Point[2][2]==1) {
			return 1;
		}
		else if(Point[0][0]==1 && Point[1][0]==1 && Point[2][0]==1) {
			return 1;
		}
		else if(Point[0][1]==1 && Point[1][1]==1 && Point[2][1]==1) {
			return 1;
		}
		else if(Point[0][2]==1 && Point[1][2]==1 && Point[2][2]==1) {
			return 1;
		}
		else if(Point[0][0]==1 && Point[1][1]==1 && Point[2][2]==1)
		{
			return 1;
		}
		else if(Point[0][2]==1 && Point[1][1]==1 && Point[2][0]==1) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	public int DrawMatch()
	{	int zero=0;
		int play1=Player1win();
		int play2=Player2win();
		if(play1!=1 && play2!=2)
		{
			for(int j=0;j<3;j++)
			{
			for(int k=0;k<3;k++)
			{
				if(Point[j][k]==0) {
					zero++;
				}
					
			}
			}
		}
		else
		{
			return 0;
		}
		if(zero==0)
		{
			return 1;
		}
		else
		{
				return 0;
		}
	}
	public int Player2win() {
		if(Point[0][0]==2 && Point[0][1]==2 && Point[0][2]==2)
		{
			return 2;
		}
		else if(Point[1][0]==2 && Point[1][1]==2 && Point[1][2]==2)
		{
			return 2;
		}
		else if(Point[2][0]==2 && Point[2][1]==2 && Point[2][2]==2) {
			return 2;
		}
		else if(Point[0][0]==2 && Point[1][0]==2 && Point[2][0]==2) {
			return 2;
		}
		else if(Point[0][1]==2 && Point[1][1]==2 && Point[2][1]==2) {
			return 2;
		}
		else if(Point[0][2]==2 && Point[1][2]==2 && Point[2][2]==2) {
			return 2;
		}
		else if(Point[0][0]==2 && Point[1][1]==2 && Point[2][2]==2)
		{
			return 2;
		}
		else if(Point[0][2]==2 && Point[1][1]==2 && Point[2][0]==2) {
			return 2;
		}
		else {
			return -1;
		}
		
		
	}
	public static void main(String[] args) {
		launch(args);
		
		
	}
	public void start(Stage stage) throws Exception
	{	
		Button b1=new Button();
		Button b2=new Button();
		Button b3=new Button();
		Button b4=new Button();
		Button b5=new Button();
		Button b6=new Button();
		Button b7=new Button();
		Button b8=new Button();
		Button b9=new Button();
		Button reset = new Button("reset");
		Text player1win =new Text("Player 1 Win \n \n");
		Text player2win =new Text("player 2 Win \n \n");
		Text Title1 =new Text("Player 1 :- 0 ");
		Text Title2 =new Text("Player 2 :- ×  \n");
		Text drawmatch =new Text("Match is Draw \n \n");
		
		Text welcometxt =new Text(" \n \n \n \t  \t Devlop and Design by RK Group ");
		Button welcome =new Button();
				welcome.setPrefSize(200,70);
				welcome.setText("Click here to play");
				welcome.setFont(new Font(20));
				Title1.setFont(new Font(30));
				Title2.setFont(new Font(30));
				player1win.setFont(new Font(40));
				player2win.setFont(new Font(40));
				drawmatch.setFont(new Font(40));
		reset.setPrefSize(70.0, 30.0);
		b1.setPrefSize(70.0, 70.0);
		b2.setPrefSize(70.0, 70.0);
		b3.setPrefSize(70.0, 70.0);
		b4.setPrefSize(70.0, 70.0);
		b5.setPrefSize(70.0, 70.0);
		b6.setPrefSize(70.0, 70.0);
		b7.setPrefSize(70.0, 70.0);
		b9.setPrefSize(70.0, 70.0);
		b8.setPrefSize(70.0, 70.0);
		 	GridPane gridPane = new GridPane();    
		 	gridPane.setPadding(new Insets(15, 15, 15, 15)); 
		
		 	gridPane.setVgap(20); 
		 	gridPane.setHgap(10);  
		 	gridPane.setAlignment(Pos.CENTER); 
		     gridPane.add(welcome, 0, 2);
		     gridPane.add(Title1, 0, 0);
		     gridPane.add(Title2, 0, 1);
		     gridPane.add(welcometxt, 0,3);
		     welcome.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	
						gridPane.getChildren().removeAll(welcome,Title1,Title2,welcometxt);
						gridPane.add(b1, 0, 0);
						gridPane.setVgap(10); 
						gridPane.setPadding(new Insets(10, 10, 10, 10));
					      gridPane.add(b2, 1, 0);
					      gridPane.add(b3, 2, 0);
					      gridPane.add(b4, 0, 1);
					      gridPane.add(b5, 1, 1);
					      gridPane.add(b6, 2, 1);
					      gridPane.add(b7, 0, 2);
					      gridPane.add(b8, 1, 2);
					      gridPane.add(b9, 2, 2);
					      gridPane.add(reset, 1, 3);
					}
				});
		      
		      
		    b1.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{ if(Point[0][0]==0 && Point[0][0]==0)
					{
						if(turn==1) {
							Point[0][0]=1;
							b1.setText("0");
							b1.setFont(new Font(32));
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 1);							
								gridPane.add(reset,0, 1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=2;
						}
						else {
							b1.setText("×");
							b1.setFont(new Font(32));
							Point[0][0]=2;
							int player2=Player2win();
							if(player2==2)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=1;
						}
						
					}}
				});
		    b2.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	if(Point[0][1]==0 && Point[0][1]==0)
					{
						if(turn==1) {
							Point[0][1]=1;
							b2.setText("0");
							b2.setFont(new Font(32));
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=2;
						}
						else {
							
							Point[0][1]=2;
							b2.setText("×");
							b2.setFont(new Font(32));
							int player2=Player2win();
							if(player2==2)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=1;
						}
						
					}}
				});
		    b3.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(Point[0][2]==0 && Point[0][2]==0)
					{
					if(turn==1) {
						Point[0][2]=1;
						b3.setText("0");
						b3.setFont(new Font(32));
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player2=Player2win();
						if(player2==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=2;
					}
					else {
						
						Point[0][2]=2;
						b3.setText("×");
						b3.setFont(new Font(32));
						int player2=Player2win();
						if(player2==2)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=1;
					}
					
				}}
			});
		    b4.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{	if(Point[1][0]==0 && Point[1][0]==0)
				{
					if(turn==1) {
						Point[1][0]=1;
						b4.setText("0");
						b4.setFont(new Font(32));
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player2=Player2win();
						if(player2==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=2;
					}
					else {
						
						Point[1][0]=2;
						b4.setText("×");
						b4.setFont(new Font(32));
						int player2=Player2win();
						if(player2==2)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=1;
					}
					
				}}
			});
		    b5.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{	if(Point[1][1]==0 && Point[1][1]==0)
					{
					if(turn==1) {
						Point[1][1]=1;
						b5.setText("0");
						b5.setFont(new Font(32));
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player2=Player2win();
						if(player2==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=2;
					}
					else {
						
						Point[1][1]=2;
						b5.setText("×");
						b5.setFont(new Font(32));
						int player2=Player2win();
						if(player2==2)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=1;
					}
					
				}}
			});
		    b6.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{	if(Point[1][2]==0 && Point[1][2]==0)
				{
					if(turn==1) {
						Point[1][2]=1;
						b6.setText("0");
						b6.setFont(new Font(32));
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player2=Player2win();
						if(player2==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=2;
					}
					else {
						
						Point[1][2]=2;
						b6.setText("×");
						b6.setFont(new Font(32));
						int player2=Player2win();
						if(player2==2)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player2win,0, 0);
							gridPane.add(reset,0, 1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(drawmatch,0, 0);
							
							gridPane.add(reset,0, 1);
						}
						int player1=Player1win();
						if(player1==1)
						{
							gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
							reset.setText("play"); rturn=0;
							gridPane.add(player1win,0, 0);
							gridPane.add(reset,0, 1);
						}
						turn=1;
					}
					
				}}
			});
		    b7.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	if(Point[2][0]==0 && Point[2][0]==0)
					{
						if(turn==1) {
							Point[2][0]=1;
							b7.setText("0");
							b7.setFont(new Font(32));
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=2;
						}
						else {
							
							Point[2][0]=2;
							b7.setText("×");
							b7.setFont(new Font(32));
							int player2=Player2win();
							if(player2==2)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=1;
						}
						
					}}
				});
		    b8.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	if(Point[2][1]==0 && Point[2][1]==0)
					{
						if(turn==1) {
							Point[2][1]=1;
							b8.setText("0");
							b8.setFont(new Font(32));
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=2;
						}
						else {
							
							Point[2][1]=2;
							b8.setText("×");
							b8.setFont(new Font(32));
							int player2=Player2win();
							if(player2==2)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=1;
						}
						
					}}
				});
		    b9.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	if(Point[2][2]==0 && Point[2][2]==0)
					{
						if(turn==1) {
							Point[2][2]=1;
							b9.setText("0");
							b9.setFont(new Font(32));
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=2;
						}
						else {
							
							Point[2][2]=2;
							b9.setText("×");
							b9.setFont(new Font(32));
							int player2=Player2win();
							if(player2==2)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player2win,0, 0);
								gridPane.add(reset,0, 1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(drawmatch,0, 0);
								
								gridPane.add(reset,0, 1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gridPane.getChildren().removeAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,reset);
								reset.setText("play"); rturn=0;
								gridPane.add(player1win,0, 0);
								gridPane.add(reset,0, 1);
							}
							turn=1;
						}
						
					}}
				});
		    
		    
		    reset.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{	if(rturn==0)
					{	
						reset.setText("reset");rturn=1;
						for(int j=0;j<3;j++)
						{
							for(int k=0;k<3;k++)
							{
								Point[j][k]=0;
							}
						}
						gridPane.getChildren().removeAll(player1win,player2win,drawmatch);
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
							gridPane.add(b1, 0 ,0);
						gridPane.add(b2, 1, 0);
					      gridPane.add(b3, 2, 0);
					      gridPane.add(b4, 0, 1);
					      gridPane.add(b5, 1, 1);
					      gridPane.add(b6, 2, 1);
					      gridPane.add(b7, 0, 2);
					      gridPane.add(b8, 1, 2);
					      gridPane.add(b9, 2, 2);
					      gridPane.add(reset, 1, 3);
					}
				else
				{ 	for(int j=0;j<3;j++)
					{
					for(int k=0;k<3;k++)
					{
						Point[j][k]=0;
					}
				}
						
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
			      	rturn=1;
					
				}
				}		
				
			});
			
		
		      Scene scene = new Scene(gridPane,350,350); 
		      stage.setTitle("tic tac toe ");
		      stage.setScene(scene); 
		      stage.show();
	}

}
