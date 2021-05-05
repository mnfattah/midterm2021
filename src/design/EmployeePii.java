package design;

//Source: https://github.com/mdarefin/Core-Java/tree/master/src/employee/info/system

public abstract class EmployeePii {

    private String name;
    private String address;
    private double salary;
    private int number;
    private int employeeID;

    public EmployeePii(String name) {
        this.name = name;
    }

    public EmployeePii(int employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeePii(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public EmployeePii(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public EmployeePii(String name, int number2, double salary) {
        this.name = name;
        this.salary = salary;
        this.number = number2;
    }

    public double computePay() {
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.salary);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    // ployMorphism
    public abstract double monthlySalary();


}
