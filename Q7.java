package Assignment_01;
import java.util.Scanner;

class Employee
{
    static int count = 0;
    static int c = 0;
    
    Employee(){
    	c++;
    }
    
    void display()
    {
        count++;
    }
    void result()
    {
        System.out.println("No. of times object is created : " + c);
        System.out.println("No. of times display function is called : " + count);
    }

}

public class Q7{
    public static void main (String [] args){
    	
        Scanner sc = new Scanner(System.in);

        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        Employee obj4 = new Employee();

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
     
        obj4.result();
        
    }
}