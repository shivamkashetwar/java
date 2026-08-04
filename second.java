package inherit;

class Animal{
	public void eat() {
		System.out.println("this animal eat food");
		
	}
}

class dog extends Animal{
	public void bark() {
	System.out.println("the dog barks");
	}
}

public class second {
	public static void main (String[] args) {
		dog tomy=new dog();
		
        tomy.eat();
        tomy.bark();
		
	}
	
}