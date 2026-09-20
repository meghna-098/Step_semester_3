public class M1 {

    // -----------------------------------------
    // PlacementRecord class
    // -----------------------------------------
    static class PlacementRecord {

        // Instance fields
        String studentName;
        String company;
        double packageLpa;

        // Constructor
        PlacementRecord(
                String studentName,
                String company,
                double packageLpa) {

            this.studentName = studentName;
            this.company = company;
            this.packageLpa = packageLpa;
        }

        // Instance method
        void printRecord() {

            System.out.println(
                studentName
                + " -> "
                + company
                + " @ "
                + packageLpa
                + " LPA"
            );
        }
    }

    // -----------------------------------------
    // Main method
    // -----------------------------------------
    public static void main(String[] args) {

        // Create three objects
        PlacementRecord student1 =
            new PlacementRecord(
                "Ravi",
                "TCS",
                4.5
            );

        PlacementRecord student2 =
            new PlacementRecord(
                "Anitha",
                "Zoho",
                6.2
            );

        PlacementRecord student3 =
            new PlacementRecord(
                "Karthik",
                "Infosys",
                4.0
            );

        // Store objects in an array
        PlacementRecord[] records = {
            student1,
            student2,
            student3
        };

        // Print every record
        for (int i = 0; i < records.length; i++) {

            records[i].printRecord();
        }
    }
}
