
public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    // The `startFight()` method in the `Arena` class is responsible for initiating the fight
    

    public void startFight() {
        System.out.println("Fight started between " + player1 + " and " + player2);

        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() < player2.getHealth()) {
                attack(player1, player2);
            } else {
                attack(player2, player1);
            }
            if (player1.isAlive() && player2.isAlive()) {
                attack(player2, player1);
            }
        }

        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    private void attack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;
        int damage = Math.max(0, attackDamage - defenseStrength);

        defender.reduceHealth(damage);

        System.out.println(attacker.getName() + " attacks with roll " + attackRoll + " causing damage " + attackDamage);
        System.out.println(defender.getName() + " defends with roll " + defenseRoll + " reducing damage to " + damage);
        System.out.println(defender.getName() + " health is now " + defender.getHealth());
    }
}
