package inter;
/*
 * 使用接口实现多态，说明其用法。
 * 实现了接口的类，属于这个接口类型
 * 接口的限制大致和抽象类相同
 * 不同的是，抽象类是可以有实现的方法
 * 接口是完完全全的抽象，不能有实现的方法
 */
import javax.xml.stream.events.StartDocument;

public class lab3 {

	public static void main(String[] args) {
		Phone p=new Phone();
		Camera c =new Camera();
		Computer cp=new Computer();
		cp.useUsb(c);
		cp.useUsb(p);
	}

}

interface Usb{
	public void Start();
	public void Stop();
	
}

class Phone implements Usb{

	public void Start() {
		System.out.println("phone Start!");
	}

	public void Stop() {
		System.out.println("phone Stop!");
	}
	
}

class Camera implements Usb{

	public void Start() {
		System.out.println("Camera Start!");
	}

	public void Stop() {
		System.out.println("Camera Start!");
	}
	
}

class Computer {
	public void useUsb(Usb u){
		u.Start();
		u.Stop();
	}
}
