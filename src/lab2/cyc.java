package lab2;

import java.security.CryptoPrimitive;

public class cyc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		animal.Cry();
		Dog dog=new Dog();
		dog.name="cc";
		System.out.println(dog.name);
		dog.Cry();
	}

}
/*
 * 抽象类：父类的方法、功能不明确，所以就不会去实现
 * 就使用abstract修饰。
 * 继承了抽象类的子类一定要实现他所有抽象方法
 * 抽象方法只能在之类中实现
 * 抽象类不能直接被new出来，因为他自己的意义都不明确，编译器自然更加不明白
 */
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