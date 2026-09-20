public class M3 {

    static class Employee {

        // Instance fields
        String empId;
        String empName;
        double salary;
        boolean isIntern;

        // -----------------------------------------
        // Constructor for permanent employee
        // -----------------------------------------
        public Employee(
                String empId,
                String empName,
                double salary) {

            this.empId = empId;
            this.empName = empName;
            this.salary = salary;

            // Permanent employee
            this.isIntern = false;
        }

        // -----------------------------------------
        // Constructor for intern
        // -----------------------------------------
        public Employee(
                String empId,
                String empName) {

            // Call the three-argument constructor
            this(
                empId,
                empName,
                0
            );

            // Change intern status
            this.isIntern = true;
        }

        // -----------------------------------------
        // Print employee information
        // -----------------------------------------
        public void printProfile() {

            System.out.println(
                empId
                + " | "
                + empName
                + " | Rs "
                + salary
                + " | Intern: "
                + isIntern
            );
        }
    }

    public static void main(String[] args) {

        // Permanent employee
        Employee permanent =
            new Employee(
                "E-101",
                "Divya",
                65000
            );

        // Intern
        Employee intern =
            new Employee(
                "E-102",
                "Arjun"
            );

        // Print both profiles
        permanent.printProfile();
        intern.printProfile();
    }
}
