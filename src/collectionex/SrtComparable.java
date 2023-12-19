package collectionex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class StudentData implements Comparable<StudentData>
{
String name;
int rollNo;
String degree;
int passYr;

	public StudentData(String name, int rollNo, String degree, int passYr) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.degree = degree;
	this.passYr = passYr;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getPassYr() {
		return passYr;
	}
	public void setPassYr(int passYr) {
		this.passYr = passYr;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", rollNo=" + rollNo + ", degree=" + degree + ", passYr=" + passYr + "]";
	}
//	@Override
//	public int compareTo(StudentData o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.name);
//	}
//	@Override
//	public int compareTo(StudentData o) {
//		// TODO Auto-generated method stub
//		return this.degree.compareTo(o.degree);
//	}
	@Override
	public int compareTo(StudentData o) {
		// TODO Auto-generated method stub
		if(this.getPassYr()>o.getPassYr())
		{
			return 1;
		}
		else if(this.getPassYr()<o.getPassYr())

	{
			return -1;
			}
		else {
			return 0;
		}
	}
	
}
public class SrtComparable {
 public static void main(String[] args) {
	List< StudentData> al=new ArrayList<StudentData>(Arrays.asList(
			new StudentData("sita", 1, "Btech", 2020),
			new StudentData("Preetha", 2, "IT", 2022),
			new StudentData("Ashwini", 7, "MBA", 2021),
			new StudentData("Sonam", 8, "CS", 2023)
			));
	System.out.println("Sort By Name");
	Collections.sort(al);
	for(StudentData s:al)
	{
		System.out.println(s);
	}
}
}

