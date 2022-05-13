public class Wizard extends Character {
    Wizard() {
        super();
    }

    // -- Wizard Skill Number 1 --//
    public void fireStorm(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName
                        + " with Firestorm (Damage - 50), (Mana Cost - 50)");
        int damagePoints = 50;
        damageTarget1(enemyCharacter, damagePoints);
    };

    public void mpCost(Character selfCharacter) {
        int manaCost = 50;
        WizmanaCost(selfCharacter, manaCost);
    }

    // ---------------------------------------------------------------------------------//
    // -- Wizard Skill Number 2 (Recover) --//
    public void HealingGaling(Character selfCharacter) {
        System.out.println(super.characterName + " Use Healing Galing +35HP, +35MP ");
        int healthPoints = 35;
        int manaPoints = 35;
        recoverEnemy(selfCharacter, healthPoints, manaPoints);
    };

    // ---------------------------------------------------------------------------------//
    // -- Wizard Skill Number 3 --//
    public void GuardiansWraith(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName
                        + " with Guardians Wraith (Damage - 75), (Mana Cost - 50)");
        int damagePoints = 75;
        damageTarget1(enemyCharacter, damagePoints);
    };

    // ---------------------------------------------------------------------------------//
    // -- Wizard Skill Number 4 --//
    public void lightningStrike(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName
                        + " with lightning Strike (Damage - 60), (Mana Cost - 50)");
        int damagePoints = 60;
        damageTarget1(enemyCharacter, damagePoints);
    };

    // ---------------------------------------------------------------------------------//
    // -- Win Lose --//
    public void WoL(Character enemyCharacter) {
        winLose(enemyCharacter);
    }

    // -- Display Stats --//
    public void Display(Character Display) {
        Display();
    };
}
