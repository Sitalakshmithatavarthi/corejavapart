package oops;
			class Student1{
			int eno;
			String name;
			//No return even void-->not static
			//Default constructor
		   Student1(){
				eno=1;
				name="Priya";
				System.out.println("Default Constructor");
				System.out.println("Eno : "+eno+ "  NAme : "+name);
			}
		   //Parameterized Constructor)
			Student1(int eno,String nm){
				this.eno=eno;
				name=nm;
				System.out.println("Parameterized Constructor");
				System.out.println("Eno : "+this.eno+ "  NAme : "+name);
			}
			//copy Constructor
			Student1(Student1 s1){
				eno=s1.eno;
				name=s1.name;
				System.out.println("Copy Constructor");
				System.out.println("Eno : "+eno+ "  NAme : "+name);
			}
		}
		public class ClassConstructorEx {

			public static void main(String[] args) {
				Student1 s=new Student1();			
			System.out.println("********************");
			Student1 s1=new Student1(13, "Raj");
			Student1 s2=new Student1(s1);
			Student1 s3=new Student1(s);
			Student1 s4=new Student1(s1);//copy Constructor
			

		}

	}

