public class Player {
    //Creating player dm & mfs
    
    private int health;
    private int strength;
    private int attack;
    private String name;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    @Override

    public String toString() {
        return name + " [Health: " + health + ", Strength: " + strength + ", Attack: " + attack + "]";
    }
}


