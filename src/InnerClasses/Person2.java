package InnerClasses;

abstract class Person2{  
	  abstract void eat();  
	}  
	class TestAnonymousInner1{  
	 public static void main(String args[]){  
	   
		// TestAnonymousInner1.p.eat();
		 p.eat();
	 } 
	 //static anonymous class
	static Person2 p=new Person2(){  
		  void eat(){System.out.println("nice fruits");}  
		  }; 
	}  