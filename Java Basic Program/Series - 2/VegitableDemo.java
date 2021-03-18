import java.util.*;
abstract class Vegetable{
	String Color;
	Vegetable(String color){
		this.Color=color;
	}
   abstract public String toString();
}
class Potato extends Vegetable{
	 Potato(){
	 	super("yellow");
	 }
	 public String toString(){
	 	return ("Potato is "+super.Color);
	 }
}
class Brinjal extends Vegetable{
	 Brinjal(){
	 	super("Blue");
	 }
	 public String toString(){
	 	return ("Brinjal is "+super.Color);
	 }
}
class Tomato extends Vegetable{
	 Tomato(){

	 	super("Red");
	 }
	 public String toString(){
	 	return ("Tomato is "+super.Color);
	 }
}
class VegitableDemo{
	public static void main(String[] args) {
		Potato p1=new Potato();
		Tomato t1=new Tomato();
		Brinjal b1=new Brinjal();
		System.out.println(p1.toString());
		System.out.println(t1.toString());
		System.out.println(b1.toString());
	}
}
