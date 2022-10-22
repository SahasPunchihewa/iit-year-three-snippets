package week4.tute;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Mark", 5000.00);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
