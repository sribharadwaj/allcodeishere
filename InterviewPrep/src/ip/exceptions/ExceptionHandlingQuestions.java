package ip.exceptions;

public class ExceptionHandlingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			multiCatchException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void multiCatchException() throws Exception {
		try {
			int i=0;
			System.out.println(i/0);
		}catch(ArithmeticException ae) {
			throw new Exception("Arithmentic");
		}catch(NullPointerException ie) {
			
		}catch(Exception e) {
			System.out.println("In Multi exception "+e.getMessage());
		}
	}
	
}
