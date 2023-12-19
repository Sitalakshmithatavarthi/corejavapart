package exceptionex;
class Student{
	int Score;
	String name;
	public Student(String name,int Score) {
		super();
	}
	
}
class Classroom{
	public String registerStudent(Student student){
		if (!student.name.matches(".*[A-Z].*")) {
		return "Block letter need";
		}
		if(student.score<0 || student.name>=100) 
		{
			return "invalid Score";
		}
	}
}
public class StudentReport {

	public static void main(String[] args) {
		

	}

}
//public String registerStudent(Student student)
//{
//	if(!student.name.matches(".*[A-Z].*"))
//	{
//		return "Block letter needed";
//	}
//	if(student.score<0 || student.score>=100)
//	{
//		return "invalid Score";
//	}
//	return "Registered";
//}
//public String studentCard(String card)
//{
//	if(card.matches("\\d+")){
//		return "valid card";
//	}
//	else
//	{
//		return "invalid card";
//	}
//}
//
//}
//public class StudentReport {
//public static void main(String[] args) {
//Student s=new Student("S", 60);
//Classroom c=new Classroom();
//System.out.println(c.registerStudent(s));
//System.out.println(c.studentCard("abc"));