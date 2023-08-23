package Inheritance;

public class Employee {
    float salary = 400000;

}

class programmer extends Employee {
    int bonus = 5000;

    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("Programmer salary is " + p.salary);
        System.out.println("Programmer bonus is " + p.bonus);

    }
}