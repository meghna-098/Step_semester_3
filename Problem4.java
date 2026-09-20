public class Problem4 {

    static class TrafficLight {

        // Current color
        private String color;

        // ID cannot be changed
        private final String id;

        // Constructor
        public TrafficLight(String id) {

            this.id = id;

            // Every new traffic light starts at RED
            this.color = "RED";
        }

        // Move to the next color
        public void next() {

            if (color.equals("RED")) {

                color = "GREEN";

            } else if (color.equals("GREEN")) {

                color = "YELLOW";

            } else if (color.equals("YELLOW")) {

                color = "RED";
            }
        }

        // Read current color
        public String getColor() {

            return color;
        }

        // Optional ID getter
        public String getId() {

            return id;
        }
    }

    public static void main(String[] args) {

        TrafficLight t =
            new TrafficLight("TL-9");

        System.out.println(
            t.getColor()
        );

        t.next();

        System.out.println(
            t.getColor()
        );

        t.next();

        System.out.println(
            t.getColor()
        );

        t.next();

        System.out.println(
            t.getColor()
        );

        t.next();

        System.out.println(
            t.getColor()
        );
    }
}
