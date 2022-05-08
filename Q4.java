package Assignment_01;
public class Q4 {

	public static void main(String[] args) {

		three obj1 = new three(1);
		three obj2 = new three();
		
	}
}
class one{
	one(int a){
		System.out.println("inside class one "+a);		
	}
}
class two extends one{
	two(){
	    super(2);
		System.out.println("inside class two");
	}
}
class three extends two{
	three()
	{   
	    super();
	    System.out.println("inside class three ");
	}
    three(int a){
    	System.out.println("inside class three "+a);
    }
}
	