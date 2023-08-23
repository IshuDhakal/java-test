package DataTypes;

public class InstanceVariable {
    int c;

    void addition() {
        int a = 20;
        int b = 30;
        c = a + b;

    }

    void multiply() {
        int a = 30;
        int b = 10;
        c = a * b;
    }

    public static void main(String[] args) {
        InstanceVariable instance = new InstanceVariable();
        // System.out.println("I am static " + c);

        System.out.println(instance.c);

        instance.addition();
        System.out.println(instance.c);

        instance.multiply();
        System.out.println(instance.c);
    }

}
