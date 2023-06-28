package task_01;

import static task_01.Manager.salaryUp;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", "Ivanov", 33);
        e1.setPost("Audit");
        e1.setPhoneNumber("433-11-22");
        e1.setSalary(10000);
        Employee e2 = new Manager("Petr", "Prtrov", 45);
        e2.setPhoneNumber("433-11-22");
        e2.setSalary(20000);
        Employee e3 = new Manager("Alex", "Alekseev", 33);
        e3.setPhoneNumber("433-11-22");
        e3.setSalary(15000);
        Employee e4 = new Employee("Ivan", "Petrov", 44);
        e4.setPost("Audit");
        e4.setPhoneNumber("433-11-22");
        e4.setSalary(7000);
        Employee e5 = new Employee("Petr", "Ivanov", 46);
        e5.setPost("Audit");
        e5.setPhoneNumber("433-11-22");
        e5.setSalary(5000);
        //e1.FullInformationEmployee();
        Employee[] employees = new Employee[]{e1, e2, e3, e4, e5};

        for (Employee employee : employees) {
            employee.FullInformationEmployee();
        }
        salaryUp(employees, 5000);
        System.out.println();

        for (Employee employee : employees) {
            employee.FullInformationEmployee();
        }

    }
}