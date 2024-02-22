package Strings;

class ConPool{
	void shiva() {
		 String s1="shiva";
	      String s2="shiva";
	      
	      if(s1==s2)System.out.println("ref equal");
	      else System.out.println("ref not equal");
	      
	      if(s1.equals(s2))System.out.println("values are equal");
	      else System.out.println("values not equal");
	}
}

class NonConPool{
	void nare() {
		String s1=new String("nare");
	      String s2=new String("nare");
	      
	      if(s1==s2)System.out.println("ref equal");
	      else System.out.println("ref not equal");
	      
	      if(s1.equals(s2))System.out.println("values are equal");
	      else System.out.println("values not equal");
	}
}

public class MemoryAllocation {

	public static void main(String[] args) {
		
		ConPool cp = new ConPool();
		NonConPool ncp = new NonConPool();
		
		System.out.println("strings without new constant pool// no duplicate");
           cp.shiva();
           
           System.out.println("string with new ncp //duplicates");
           
	     ncp.nare();
	      
		
		
	}

}
