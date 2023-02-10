package myprgms;

public class A implements Printable,Showable {
	public void printable(){
		System.out.println("PRINTING");
	}
	public void showable(){
		System.out.println("SHOWING");
	}

	public static void main(String[] args) {
		A obj=new A();
		obj.printable();
		obj.showable();
	}
}