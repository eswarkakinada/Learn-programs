package exception;

public class ExceptionHandling {

	
	int i,j,k,s;
	public void show(){
		try{
			i=10;
			j=0;
			k=i/j;
			s=k;
			
			System.out.println("Value of s is "+s);
		}
				catch(Exception e)   
		{
			System.out.println("Division is not possible      " +e);
		} 
		
		finally {
			System.out.println("In finally block");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ExceptionHandling e1 =new ExceptionHandling();
		e1.show();
		System.out.println("End of program");   
   }
	
}
  