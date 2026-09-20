public class Problem1 {

    static class Character {

        // Current health
        private int health;

        // Maximum health cannot be changed
        private final int maxHealth;

        // Constructor
        public Character(int maxHealth) {

            this.maxHealth = maxHealth;
            this.health = maxHealth;
        }

        // Take damage
        public void takeDamage(int amount) {

            if (amount <= 0) {
                System.out.println("Damage must be positive");
                return;
            }

            // Reduce health
            health = health - amount;

            // Health cannot go below 0
            if (health < 0) {
                health = 0;
            }
        }

        // Heal character
        public void heal(int amount) {

            if (amount <= 0) {
                System.out.println("Healing amount must be positive");
                return;
            }

            // Increase health
            health = health + amount;

            // Health cannot exceed maximum
            if (health > maxHealth) {
                health = maxHealth;
            }
        }

        // Read-only access to health
        public int getHealth() {
            return health;
        }
    }

    public static void main(String[] args) {

        Character c = new Character(100);

        System.out.println("Initial health: " + c.getHealth());

        c.takeDamage(30);
        System.out.println("After 30 damage: " + c.getHealth());

        c.heal(50);
        System.out.println("After healing 50: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("After 150 damage: " + c.getHealth());
    }
}
