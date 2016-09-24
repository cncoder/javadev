package fanxing;

public class demofx {

	public static void main(String[] args) {
		// ∑∫–Õ π”√≤‚ ‘
		Test<String> test1=new Test<String>("aaa");
		test1.show();

	}

}

class Test<T>{
	private T o;
	public Test(T t){
		o=t;
	}
	
	public void show(){
		System.out.println(o.getClass().getName());
	}
}
