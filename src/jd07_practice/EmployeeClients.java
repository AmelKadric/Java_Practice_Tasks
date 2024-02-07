package jd07_practice;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Amel Kadric";
        employee1.age = 33;
        employee1.gender = 'M';
        employee1.jobTitle = "IT";
        employee1.salary = 120_000;

        System.out.println(employee1);

        System.out.println("Name: " + employee1.name);
        employee1.work();



        Employee employee2 = new Employee();

        Employee employee3 = new Employee();


    }

}
