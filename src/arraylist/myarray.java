package arraylist;

import java.util.ArrayList;

public class myarray {

	public static void main(String[] args) {

		ArrayList aList=new ArrayList();
		
		Stu s1=new Stu("A0001", "张华", 'A');
		Stu s2=new Stu("A0002", "李玟", 'B');
		Stu s3=new Stu("A0003", "王瑞", 'C');
		
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		
		for (int i = 0; i <aList.size(); i++) {
			Stu tempStu=(Stu) aList.get(i);
			System.out.println(tempStu.getName());;
		}
	}

}

class Stu{
	private String snoString;
	private String name;
	private char grade;
	
	public Stu(String sno,String n,char g){
		this.snoString=sno;
		this.name=n;
		this.grade=g;
	}
	
	public String getSnoString() {
		return snoString;
	}
	public void setSnoString(String snoString) {
		this.snoString = snoString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}