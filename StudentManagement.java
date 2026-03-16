import java.util.*;
class Student{
    private int studentId;
    private String studentName;
    private double tuitionFee;
    Student(int studentId,String studentName,double tuitionFee){
        this.studentId=studentId;
        this.studentName=studentName;
        this.tuitionFee=tuitionFee;
    }
    public int getId(){
        return this.studentId;
    }
    public String getName(){
        return this.studentName;
    }
    public double getFee(){
        return this.tuitionFee;
    }
    public void displayStudentDetails(){
        System.out.println("Student ID : "+this.studentId+"\nStudent Name : "+this.studentName+"\nTuition Fee : "+( this.tuitionFee%1==0 ? String.valueOf((long)this.tuitionFee): String.valueOf(this.tuitionFee)));
    }
}
class HostelStudent extends Student{
    private double hostelFee;
    HostelStudent(int studentId,String studentName,double tuitionFee,double hostelFee ){
        super(studentId,studentName,tuitionFee);
        this.hostelFee=hostelFee;
    }
    public void DisplayHostelStudent(){
        super.displayStudentDetails();
        System.out.println("Hostel Fee : "+ ( this.hostelFee%1==0 ? String.valueOf((long)this.hostelFee):String.valueOf(this.hostelFee)));
    }
    public void calculateTotalFee(){
        double value = super.getFee()+this.hostelFee;
        System.out.println("Total Fee : "+ (value%1==0? String.valueOf((long)value):String.valueOf(value)));
    }
}
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student ID:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Tuition Fee: ");
        double tuifee = sc.nextDouble();
        System.out.print("Enter Hostel Fee: ");
        double hosfee=sc.nextDouble();
        HostelStudent hs=new HostelStudent(id,name,tuifee,hosfee);
        hs.DisplayHostelStudent();
        hs.calculateTotalFee();
    }
}