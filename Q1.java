package Assignment_01;

public class Q1{
    public static void main(String args[]){

        Student s1=new Student("Rahul","A",19,80.90);
        Student s2=new Student("Rakesh","A",19,80.90);
        Student s3=new Student("Vaibhav","A",19,99.90);
        Student s4=new Student("KamalPreet","A",19,80);
        Student s5=new Student("Abhishek","A",19,85);
        Student s6=new Student("Cleopatra","A",19,90);

        System.out.println("Average Percentage of Students is "+Student.avgPercent);
    }
}

class Student{
    int age;
    String name,section;
    double percentage;
    static double avgPercent;
    static int totalStudents=0;

    Student(String nName,String sSection,int aAge,double pPercentage){
        name=nName;
        section=sSection;
        percentage=pPercentage;
        age=aAge;
        avgCalculator();
    }

    void avgCalculator(){
        totalStudents++;
        avgPercent=(avgPercent*(totalStudents-1)+percentage)/totalStudents;
    }
}