package inter;
/*
 * ʹ�ýӿ�ʵ�ֶ�̬��˵�����÷���
 * ʵ���˽ӿڵ��࣬��������ӿ�����
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
