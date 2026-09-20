public class M5 {

    static class Employee {

        // -----------------------------------------
        // Instance fields
        // Every Employee has its own values
        // -----------------------------------------

        String empName;
        double salary;

        // -----------------------------------------
        // Static fields
        // Shared by all Employee objects
        // -----------------------------------------

        static String companyName =
            "Bright Horizon Technologies";

        static int employeeCount = 0;

        // -----------------------------------------
        // Constructor
        // -----------------------------------------

        Employee(
                String empName,
                double salary) {

            this.empName = empName;
            this.salary = salary;

            // Increase count every time
            // an Employee object is created
            employeeCount++;
        }

        // -----------------------------------------
        // Static method
        // -----------------------------------------

        static void printCompanyInfo() {

            System.out.println(
                companyName
            );

            System.out.println(
                "Employees on record: "
                + employeeCount
            );
        }
    }

    public static void main(String[] args) {

        // Create three Employee objects

        Employee employee1 =
            new Employee(
                "Ravi",
                50000
            );

        Employee employee2 =
            new Employee(
                "Anitha",
                60000
            );

        Employee employee3 =
            new Employee(
                "Karthik",
                55000
            );

        // Call static method using class name
        Employee.printCompanyInfo();
    }
}
