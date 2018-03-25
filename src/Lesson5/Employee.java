package Lesson5;


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

    String getName() {
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
