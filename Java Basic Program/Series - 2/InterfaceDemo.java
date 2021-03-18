interface p{
	int p=0;
	public void name_p();
}
interface p1 extends p{
	int p1=1;
	public void name_p1();
}
interface p2 extends p{
	int p2=2;
	public void name_p2();
}
interface p12 extends p1 ,p2{
	int p12=12;
	public void name_p12();
}
class B implements p12{
		public void name_p(){
			System.out.println("p interface and value "+p);
		}
		public void name_p1(){
			System.out.println("p1 interface and value "+p1);
		}
		public void name_p2(){
			System.out.println("p2 interface and value "+p2);
		}
		public void name_p12(){
			System.out.println("p12 interface and value "+p12);
		}
		
}
class InterfaceDemo{
	public static void main(String[] args) {
		B c=new B();
		c.name_p();
		c.name_p1();
		c.name_p2();
		c.name_p12();
	}
}
