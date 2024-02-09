package m10_variables_data_types;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExpirience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Employtee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company Name: " + companyName);
        System.out.println("Full Time: " + isFullTime);
        System.out.println("Years of work expirience: " + yearsOfExpirience);
        System.out.println("Salary: " + "$" + salary + ".0");
        System.out.println("Married: " + isMarried);


    }

}
