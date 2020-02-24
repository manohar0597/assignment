package com.cts.training;

class Object{
	Object(){
		System.out.println("hello object");
	}
	void view(){
		System.out.println("lol object");
	}
}

 class Demo extends Object{
	Demo(){
		System.out.println("hello Demo");
	}
	void display(){
		System.out.println("lol demo");
	}
	public void view(){
		System.out.println("child demo");
	}
}

 public class DemoInheritance extends Demo {
	DemoInheritance(){
		System.out.println("hello demoinheritance");
	}
	public static void main(String...args){
		Demo d = new DemoInheritance();
//		d.view();
		DemoInheritance t = (DemoInheritance)d;
		t.display();
		t.view();
		
	}
}
