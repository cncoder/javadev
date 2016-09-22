package lab2;

import java.security.CryptoPrimitive;

public class cyc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.name="cc";
		System.out.println(dog.name);
		dog.Cry();
	}

}

class Animal{
	public String name;
	protected void Cry(){
		System.out.println("kong");
	}
}

class Dog extends Animal
{
	public void Cry(){
		System.out.println("wwwww");
	}
}