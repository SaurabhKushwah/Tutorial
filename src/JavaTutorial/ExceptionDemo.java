package JavaTutorial;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Finally block should only be used with Try Catch block
		//Finally block will ne be executed only when JVM is closed forcefully 
		
		int div, a = 10, b = 20, c= 0;
		try 
		{
			div = a/c;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Arithmetic exception");
		}
		catch(Exception e)
		{
		//	System.out.println(e);
			System.out.println("The exception got caught");
			System.out.println(b/a);
		}finally
		{
			System.out.println("Delete Cookies");
		}
		
////////////////////////////////////////////////////////////////////
		int arr[] = {2,6,3,4,6};
		
		try {
			for(int i=0; i< 10; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}catch(IndexOutOfBoundsException io) {
			System.out.println("Index out of bound exception");
		}
		
	}

}
