package Lesson5;

public void printEmployees() {
        for (int i = 0; i < employeesArray.length; i++) {
        if (employeesArray[i].getAge() > 40)
        System.out.println("Name: " + employeesArray[i].getName() + "\n"
        + "employment: " + employeesArray[i].getEmployment() + "\n"
        + "email: " + employeesArray[i].getEmail() + "\n"
        + "phonenumber: " + employeesArray[i].getPhonenumber() + "\n"
        + "salary: " + employeesArray[i].getSalary() + "\n"
        + "age: " + employeesArray[i].getAge() + "\n");
        }
        }
public class Employee {
    private String name;
    private String employment;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    public Employee(String name, String employment, String email,
                    String phonenumber, int salary, int age) {
        this.name = name;
        this.employment = employment;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmployment() {
        return employment;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
