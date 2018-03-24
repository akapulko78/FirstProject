package Lesson5;


import static Lesson5.Employee.printEmployees;


public class Lesson5 {

        public static void main(String[] args) {



            Employee[] employeesArray = new Employee[5];

            employeesArray[0] = new Employee("Egor", "engineer",
                    "Egor@company.com", "1111", 1000, 20);
            employeesArray[1] = new Employee("Olga", "cashier",
                    "Olga@company.com", "1112", 1500,30);
            employeesArray[2] = new Employee("Petr", "security",
                    "Petr@company.com", "1113", 1300,40);

            employeesArray[3] = new Employee("Elena", "bookkeeper",
                    "Elena@company.com", "1114", 2000,45);

            employeesArray[4] = new Employee("Sergey", "boss",
                    "Sergey@company.com", "1115", 3000,50);
            printEmployees();
        }




}
