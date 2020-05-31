
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import java.io.*;
import javafx.event.*;
import javafx.scene.control.*; 
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import javafx.geometry.*; 
public class CalculatorDemo extends Application{
	
	public int  turn=1;
	public String operand1=""; 
	public String operand2="";
	public int opration=-1;
	public int push=0;
	public int pop=0;
	public double oper1=0;
	public double oper2=0;
	public String ans="";
	public  void start(Stage stage) throws Exception
	{		Button b1=new Button("1");
			Button b2=new Button("2");
			Button b3=new Button("3");
			Button b4=new Button("4");
			Button b5=new Button("5");
			Button b6=new Button("6");
			Button b7=new Button("7");
			Button b8=new Button("8");
			Button b9=new Button("9");
			Button addition=new Button("+");
			Button subtraction=new Button("-");
			Button division=new Button("/");
			Button multiplay=new Button("×");
			Button equal=new Button("=");
			Button clear=new Button("AC");
			Button dot=new Button(".");
			Button doublezero=new Button("00");Button backspace=new Button("<--");
			Button zero=new Button("0");
			TextField show=new TextField("");
			show.setEditable(false);
			show.setStyle("-fx-text-box-border: #000000;-fx-focus:#000000;");
			show.setFont(new Font(16));
				GridPane gridpane=new GridPane(); 
				gridpane.setPadding(new Insets(10, 10, 10, 10)); 
				
			  gridpane.setVgap(15); 
		      gridpane.setHgap(10);  
		      gridpane.setAlignment(Pos.CENTER);
		      clear.setPrefSize(55,35);
		      multiplay.setPrefSize(55, 35);
		      multiplay.setFont(new Font(18));
		      division.setFont(new Font(16));
		      clear.setFont(new Font(14));
		      
		      division.setPrefSize(55, 35);
		  
		      backspace.setPrefSize(55, 35);
		      backspace.setFont(new Font(16));
		      
		      b7.setPrefSize(55, 35);
		      b7.setFont(new Font(16));
		      b8.setPrefSize(55, 35);
		      b8.setFont(new Font(16));
		      b9.setPrefSize(55, 35);
		      b9.setFont(new Font(16));
		      b6.setPrefSize(55, 35);
		      b6.setFont(new Font(16));
		      b5.setPrefSize(55, 35);
		      b5.setFont(new Font(16));
		      b4.setPrefSize(55, 35);
		      b4.setFont(new Font(16));
		      b3.setPrefSize(55, 35);
		      b3.setFont(new Font(16));
		      b2.setPrefSize(55, 35);
		      b2.setFont(new Font(16));
		      b1.setPrefSize(55, 35);
		      b1.setFont(new Font(16));
		      zero.setPrefSize(55, 35);
		      zero.setFont(new Font(16));
		      equal.setPrefSize(55, 35);
		      equal.setFont(new Font(16));
		      doublezero.setPrefSize(55, 35);
		      doublezero.setFont(new Font(16));
		      
		      dot.setPrefSize(55, 35);
		      dot.setFont(new Font(16));
		      addition.setPrefSize(55, 90);
		      addition.setFont(new Font(16));
		      
		      subtraction.setPrefSize(55, 35);
		      subtraction.setFont(new Font(16));
		      
		      gridpane.add(show, 0, 0, 4, 1);
		      gridpane.add(clear, 0, 1);
		      gridpane.add(backspace, 1, 1);
		      gridpane.add(multiplay, 2, 1);
		      gridpane.add(division, 3, 1);
		      gridpane.add(b7, 0, 2);
		      gridpane.add(b8, 1, 2);
		      gridpane.add(b9, 2, 2);
		      gridpane.add(subtraction, 3, 2);
		      gridpane.add(b4, 0, 3);
		      gridpane.add(b5, 1, 3);
		      gridpane.add(b6, 2, 3);
		      gridpane.add(addition, 3, 3, 1, 2);
		      gridpane.add(b1, 0, 4);
		      gridpane.add(b2, 1, 4);
		      gridpane.add(b3, 2, 4);
		      gridpane.add(doublezero, 0, 5);
		      gridpane.add(zero, 1, 5);
		      gridpane.add(dot, 2, 5);
		      gridpane.add(equal, 3, 5);
		      
		      // mian logic 
		      b1.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"1";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"1";
							show.setText(operand2);
						}
						}
				});
		      b2.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"2";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"2";
							show.setText(operand2);
						}
						}
				}); 
		      b3.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"3";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"3";
							show.setText(operand2);
						}
						}
				}); 
		      b4.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"4";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"4";
							show.setText(operand2);
						}
						}
				}); 
		      b5.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"5";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"5";
							show.setText(operand2);
						}
						}
				}); 
		      b6.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"6";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"6";
							show.setText(operand2);
						}
						}
				}); 
		      b7.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"7";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"7";
							show.setText(operand2);
						}
						}
				}); 
		      b8.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"8";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"8";
							show.setText(operand2);
						}
						}
				});
		      b9.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"9";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"9";
							show.setText(operand2);
						}
						}
				}); 
		      zero.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"0";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"0";
							show.setText(operand2);
						}
						}
				}); 
		      dot.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{		if(push==0) {
								if(turn==1) {
									operand1=operand1+".";
									show.setText(operand1);
									push++;
								}}
					if(pop==0) {
								if(turn==2) {
									operand2=operand2+".";
									show.setText(operand2);
									pop++;
								}
						}
					}
				});
		      doublezero.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1) {
							operand1=operand1+"00";
							show.setText(operand1);
						}
						if(turn==2) {
							operand2=operand2+"00";
							show.setText(operand2);
						}
						}
				});
		      addition.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1 ||  turn==2) {
							show.setText(operand2);
							turn=2;
							opration=0;
						}
						}
				});
		      division.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1 ||  turn==2) {
							show.setText(operand2);
							turn=2;
							opration=3;
						}
						}
				});
		      subtraction.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1 ||  turn==2) {
							show.setText(operand2);
							turn=2;
							opration=1;
						}
						}
				});
		      multiplay.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==1 ||  turn==2) {
							show.setText(operand2);
							turn=2;
							opration=2;
						}
						}
				});
		      equal.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						if(turn==2) {
							switch(opration) {
							case 0:
								oper1=Double.parseDouble(operand1);
								oper2=Double.parseDouble(operand2);
								oper2=oper1+oper2;
								ans=String.valueOf(oper2);
								show.setText(ans);
								turn=1;operand1="";operand2="";
								opration=-1;push=0;pop=0;
								break;
							case 1:
								oper1=Double.parseDouble(operand1);
								oper2=Double.parseDouble(operand2);
								oper2=oper1-oper2;
								ans=String.valueOf(oper2);
								show.setText(ans);
								turn=1;operand1="";operand2="";
								opration=-1;push=0;pop=0;
								break;
							case 2:
								oper1=Double.parseDouble(operand1);
								oper2=Double.parseDouble(operand2);
								oper2=oper1*oper2;
								ans=String.valueOf(oper2);
								show.setText(ans);
								turn=1;operand1="";operand2="";
								opration=-1;push=0;pop=0;
								break;
							case 3:
								oper1=Double.parseDouble(operand1);
								oper2=Double.parseDouble(operand2);
								oper2=oper1/oper2;
								ans=String.valueOf(oper2);
								show.setText(ans);
								turn=1;operand1="";operand2="";
								opration=-1;push=0;pop=0;
								break;
							}
						}
						}
				});
		      clear.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{
						turn=1;operand1="";operand2="";
						opration=-1;push=0;pop=0;
						show.setText(operand1);
						}
				});
		      backspace.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	
						if(turn==1 && operand1!="") {
							operand1=operand1.substring(0, operand1.length()-1);
							show.setText(operand1);
						}
						else {
							if(turn==2 && operand2!="") {
								operand2=operand2.substring(0, operand2.length()-1);
								show.setText(operand2);
							
						}}
					}	
					
				});
		      
		      
			Scene scene = new Scene(gridpane,350,350); 
	      stage.setTitle("Calculator");
	      stage.setScene(scene); 
	      stage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	
	

}
