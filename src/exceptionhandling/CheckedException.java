package exceptionhandling;

public class CheckedException {

	public static void main(String[] args) {
System.out.println("printing started");
System.out.println("program is in progress");
       try
      {
        Thread.sleep(10000);
      }
       catch(InterruptedException e)
       {
    	   
       }
       


System.out.println("programm completed");
System.out.println("programm exited");
	}

}
