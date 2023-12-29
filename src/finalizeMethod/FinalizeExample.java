package finalizeMethod;

public class FinalizeExample {
	
	public static void main(String[] args) {
		
		FinalizeExample f = new FinalizeExample();
		
		//print hashCode of the object reference 
		System.out.println(f.hashCode());
		
		f=null;
		
		//Call the Garbage collector to perform clean-up activities
		System.gc();
		
		System.out.println("End of the garbage collection");
		
	}
		protected void finalize() {
			
			System.out.println("Called the finalize() method");
			
		}
		
	}
	