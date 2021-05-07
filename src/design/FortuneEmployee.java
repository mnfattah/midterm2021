package design;

public class FortuneEmployee extends EmployeeInfo {

    public FortuneEmployee(String name, int number, double salary) {
        super(name, number, salary);
    }

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use MySql Database to store data and retrieve data.
     **/
    public static void main(String[] args) {

        FortuneEmployee fe = new FortuneEmployee("Asif", 02, 6000.00);

        System.out.println("Employee Name " + fe.getName());
        fe.setYearOfEmployeement(10);
        fe.setSalary(9000.00);

        System.out.println("Employee works for this company is about "+fe.getYearOfEmployeement()+" years.");

        System.out.println("Employee's monthly salary is "+ fe.getSalary());

        fe.mailCheck();

        double b = fe.calculateEmployeeBonus(9000.00,"Average");

        System.out.println("Employee bonus is "+b);




    }

}
