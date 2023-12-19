package exceptionex;
class ExceptionMovieExample extends Exception{
	public ExceptionMovieExample(String msg) {
		super(msg);
	}
}
public class ExceptionMovieExample{
	String invalidAge(int age)throws ExceptionMovie{
		if(age<18) {
			throw new ExceptionMovie("Age is smaller than 18");
			}
			else {
				return "Valid ";	
		}
	}
	public static void main(String[] args) {
		MovieExceptionExample m=new MovieExceptionExample();
		try {
			System.out.println(m.invalidAge(-22));
		} 
		catch (ExceptionMovieExample e) {
			System.out.println(e.getMessage());
		}

	}



	}


