package task_01;
/*
Домашнее задание: Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */

public class Manager extends Employee {
    public Manager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        setPost("Manager");
    }

    public static void salaryUp(Employee[] employees, int upSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPost() != "Manager") {
                employees[i].setSalary(employees[i].getSalary() + upSalary);
            }
        }
    }
}
