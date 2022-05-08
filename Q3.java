package Assignment_01;
import java.util.Scanner;

interface In1{
    void display(int p);
}


public class Q3{
	public static void main(String[] args) {
		
	Scanner obj=new Scanner(System.in);
	testClass o=new testClass();
	
	int p;
	System.out.println("Enter the value of P : ");
	p = obj.nextInt();
	o.display(p);
  }
}

class testClass implements In1{
	
    public void display(int p){
    	
    	int c =0;
    	
    	if(p == 2 || p==3) {
    		System.out.println("Prime number");
    	}
    	
    	else {
	    	for(int i=2; i<p; i++) {
	    		for(int j=2; j<p; j++) {
	    			if(i*j == p) {
	    				c++;
	    			}
	    		}
	    	}
    	}
    	
    	if(c>0) {
    		System.out.println("Not a prime number");
    	}
    	else {
    		System.out.println("prime number ");
    	}
    	
    }
 }