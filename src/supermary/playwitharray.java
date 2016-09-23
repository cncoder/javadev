package supermary;

/*
 * 弱智版炒鸡玛利亚
 */
import java.util.Scanner;

public class playwitharray {

	public static void main(String[] args) {
		Smallmarry sma=new Smallmarry();
		sma.play();
	}

}

interface marry{
	public void tup();
	public void tdown();
	public void tleft();
	public void tright();
	public void show();
}


class  Smallmarry implements marry{
	static int x=0;
	static int y=0;
	char[][] point=new char[5][5];
	public Smallmarry(){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				point[i][j]= 'X';
			}
		}
		System.out.println("初始化位置中......");
		setpoint();
		show();
		System.out.println("输入u向上移动，输入d向下移动，输入l向左移动，输入r向右移动~");
		System.out.println("游戏开始了(输入e结束游戏)：");
	}
	
	public void setpoint(){
		Scanner in = new Scanner(System.in);    //Scanner类
		System.out.println("Please input a int number:");
		int a = in.nextInt();  //接收float数据
		System.out.println("Please input other  int number:");
		int b = in.nextInt();  //接收float数据
		x=a-1;y=b-1;
		point[x][y]='@';
	}
	
	public void tleft() {
		point[x][y]='X';
		point[x][y-1]='@';
		y=y-1;
	}

	public void tright() {
		point[x][y]='X';
		point[x][y+1]='@';
		y=y+1;
	}

	public void tup() {
		point[x][y]='X';
		point[x-1][y]='@';
		x=x-1;
	}

	public void tdown() {
		point[x][y]='X';
		point[x+1][y]='@';
		x=x+1;
	}
	
	public void play(){
		String i="w";
		while (!i.equals("e")) {
			Scanner in = new Scanner(System.in);    //Scanner类
			System.out.println("Please input a int number:");
			i = in.nextLine().toLowerCase();  
			if (i.equals("u")) {
				System.out.println("向上移动");
				tup();
				show();
			}
			if (i.equals("d")) {
				tdown();
				show();
			}
			if (i.equals("l")) {
				tleft();
				show();
			}
			if (i.equals("r")) {
				tright();
				show();
			}
		}
		System.out.println("游戏结束！");
	}
	
	@Override
	public void show() {
		for (char[] p:point) {
			for(char temp:p){
				System.out.print(temp);
			}
			System.out.println();
		}
	}
	
}