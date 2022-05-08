package Assignment_01;
public class Q2
{
	public static void main(String[] args) {
		
        ABC obj1=new ABC();
        obj1.call();
        ABC obj2=new ABC();
        obj2.call();
        ABC obj3=new ABC();
        obj3.call();
        ABC obj4=new ABC();
        obj4.call();
        ABC.display();
	}
}
class ABC
{
    static int c=0;
    
    void call() {
    	c++;
    }
    
    static void  display()
    {
    	System.out.println("Total number of calls : " + c);
    }
}