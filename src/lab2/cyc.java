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
 * �����ࣺ����ķ��������ܲ���ȷ�����ԾͲ���ȥʵ��
 * ��ʹ��abstract���Ρ�
 * �̳��˳����������һ��Ҫʵ�������г��󷽷�
 * ���󷽷�ֻ����֮����ʵ��
 * �����಻��ֱ�ӱ�new��������Ϊ���Լ������嶼����ȷ����������Ȼ���Ӳ�����
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