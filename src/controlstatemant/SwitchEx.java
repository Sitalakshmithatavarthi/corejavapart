package controlstatemant;

public class SwitchEx {

	public static void main(String[] args) {
		
		char days='a';
		switch (days) {
		case 'a': {
			
			System.out.println("monday");
			break;
		}
        case 'b': {
			
			System.out.println("tuesday");
			break;
        }
        case 'c': {
			
			System.out.println("wednesday");
			break;
        }
        
		default:
		  {
				
				System.out.println("Invalid");
				break;
	        }
		}
			
		

	}

}
