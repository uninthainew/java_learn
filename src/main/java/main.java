import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Input ID");
        int studentID = sc.nextInt();

        System.out.print("Please Input Name");
        String studentName = sc.next();

        System.out.print("Please Enter your Gender");
        String studentGender = sc.next();

        System.out.print("Please Input Place of Birth");
        String placeOfBirth = sc.next();

        System.out.println("Student ID " + studentID);
        System.out.println("Student Name " + studentName);
        System.out.println("Student Gender " + studentGender);
        System.out.println("Student Place Of Birth " +placeOfBirth);
    }
}
