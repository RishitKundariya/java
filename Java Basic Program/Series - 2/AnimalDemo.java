interface Transport{
	public void deliver();
}
abstract class Animal{
	abstract public void  Animal_name();
}
class Tiger extends Animal{
	 public void  Animal_name(){
		System.out.println("This from Tiger Class");
	}
}
class Camel extends Animal implements Transport{
	public void  Animal_name(){
		System.out.println("This from Camel Class");
	}
	public void deliver(){
		System.out.println("This from Camel Class and deliver by Transport implements.");
	}
}
class Deer extends Animal{
	public void  Animal_name(){
		System.out.println("This from Deer Class");
	}
}
class Donkey extends Animal implements Transport{
	public void  Animal_name(){
		System.out.println("This from Donkey Class");
	}
	public void deliver(){
		System.out.println("This from Donkey Class and deliver by Transport implements.");
	}
}

class AnimalDemo{
	public static void main(String[] args) {
	 Transport[] tra=new Transport[2];
	 tra[0] =new Camel();
	 tra[1]=new Donkey();
	 
	 tra[0].deliver();
	 tra[1].deliver();
	}
}
