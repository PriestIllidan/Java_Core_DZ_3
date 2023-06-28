package task_01;

public class Employee {
    /*
    Задача 1: Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст.
    */
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final int AGE;
    private String post;
    private String phoneNumber;
    private int salary;


    public Employee(String firstName, String lastName, int age) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.AGE = age;
    }

    /*
    Задача 2: Написать функцию выводящую всю доступную информацию об объекте.
    */
    public void FullInformationEmployee() {
        System.out.println(String.format("First name: %s Last name: %s Age: %d Post: %s Phone number: %s Salary: %d",
                this.FIRST_NAME, this.LAST_NAME, this.AGE, this.post, this.phoneNumber, this.salary));
    }

    /*
    Задача 3: Создайте массив из сотрудников. Сделать метод с помощью которого повышаем з/п сотрудникам старше 45 лет на 5 тыс.
    */

    public void salaryUp(Employee[] employees) {
        salaryUp(employees, 45, 5000);
    }

    public void salaryUp(Employee[] employees, int age, int upSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].AGE >= age) {
                employees[i].setSalary(employees[i].getSalary() + upSalary);
            }
        }
    }


    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
