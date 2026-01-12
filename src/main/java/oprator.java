public class oprator {
    public static void main(String[] args){
//        String date_of_birth = "9/1/2007";
//        String dateOfBirth = "9/1/2007";

        //1.Operators
        int a = 20;
        int b = 20;
        int total = a*b;
        int multi = a+b;
        int reamainder = a%b;
        int minenus = a -b;
        double div = a/b;

        System.out.println("Total = " + total);
        System.out.println("toal = " +multi);
        System.out.println("toal = " +reamainder);
        System.out.println("toal = " +minenus);
        System.out.println("toal = " +div);

        //2.Comparison Operators
        System.out.println(a==b);
        System.out.println(a!= b);
        System.out.println(a>b);
        System.out.println(a<b);

        //3.Logical operator
        System.out.println("Logical Operator");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!x || !y);

    }
}
