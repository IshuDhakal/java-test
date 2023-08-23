package DataTypes;

public class Variables {

    String d = "I am instance variable";// instance variable
    static int m = 100; // static variable

    void method() {
        int n = 90;// local variable
        System.out.println("I am local variable " + n);
    }

    public static void main(String args[]) {
        Variables data = new Variables();
        data.method();

        // int data = 50;// instance variable
        System.out.println("I am static variable " + m);
        System.out.println(data.d);

    }
}// end of class
