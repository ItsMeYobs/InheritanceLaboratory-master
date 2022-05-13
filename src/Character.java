public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName
     * and mana
     * 
     * @param lvl
     * @param hp
     * @param mp
     */
    Character() {
        characterName = "Merlin The Wizard";
        level = 50;
        healthPoints = 150;
        manaPoints = 150;
    }

    Character(String name, int lvl, int hp, int mp) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mp;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    public void Display() {
        System.out.println("Character Name: " + characterName);
        System.out.println("Character Level: " + level);
        System.out.println("Character HP: " + healthPoints);
        System.out.println("Character MP: " + manaPoints);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget1(Character enemyCharacter, int damagePoints) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Saruman The Warlock HP Left = " + enemyCharacter.healthPoints);
    }

    public void WizmanaCost(Character selfCharacter, int manaCost) {
        /**
         * Deduct Mana points from enemy character
         */
        selfCharacter.manaPoints -= manaCost;
        System.out.println("Merlin The Wizard MP Left = " + manaPoints);
    }

    public void WarmanaCost(Character selfCharacter, int manaCost) {
        /**
         * Deduct Mana points from enemy character
         */
        selfCharacter.manaPoints -= manaCost;
        System.out.println("Saruman The Warlock MP Left = " + manaPoints);
    }

    public void damageTarget2(Character enemyCharacter, int damagePoints) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Merlin The Wizard HP Left = " + enemyCharacter.healthPoints);
    }

    /**
     * Prompt Character is defeated if HP falls below 0
     * eg. Character Shaman defeated.
     */
    // * }

    public void winLose(Character enemyCharacter) {
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Game Over!");
            System.out.println("Saruman The Warlock Defeated ");
        }
        return;
    };

    /**
     * Increase health points from self character
     */
    public void recoverEnemy(Character selfCharacter, int healthPoints, int manaPoints) {
        selfCharacter.healthPoints += healthPoints;
        System.out.println("Enemy character HP Left = " + selfCharacter.healthPoints);
        selfCharacter.manaPoints += manaPoints;
        System.out.println("Enemy character MP Left = " + selfCharacter.manaPoints);
    }

    public void recoverAlly(Character selfCharacter, int healthPoints, int manaPoints) {
        selfCharacter.healthPoints += healthPoints;
        System.out.println("Ally character HP Left = " + selfCharacter.healthPoints);
        selfCharacter.manaPoints += manaPoints;
        System.out.println("Ally character MP Left = " + selfCharacter.manaPoints);
    }
}