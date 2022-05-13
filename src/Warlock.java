public class Warlock extends Character {
    Warlock(String name, int lvl, int hp, int mp) {
        super(name, lvl, hp, mp);
    }

    // -- Warlock Skill Number 1 --//
    public void infernalPunishment(Character enemyCharacter) {
        System.out.println(super.characterName + " attack " + enemyCharacter.characterName
                + " with Infernal Punishment (Damage - 50), (Mana Cost - 50)");
        int damagePoints = 50;
        damageTarget2(enemyCharacter, damagePoints);
    };

    public void mpCost(Character selfCharacter) {
        int manaCost = 50;
        WarmanaCost(selfCharacter, manaCost);
    };

    // ---------------------------------------------------------------------------------//
    // -- Warlock Skill Number 2 (Recover) --//
    public void heavensTreatment(Character selfCharacter) {
        System.out.println(super.characterName + " Use Heavens Treatment +35HP, +35MP");
        int healthPoints = 35;
        int manaPoints = 35;
        recoverAlly(selfCharacter, healthPoints, manaPoints);
    };

    // ---------------------------------------------------------------------------------//
    // -- Warlock Skill Number 3 --//
    public void meteorSmash(Character enemyCharacter) {
        System.out.println(super.characterName + " attack " + enemyCharacter.characterName
                + " with Infernal Punishment (Damage - 75), (Mana Cost - 50)");
        int damagePoints = 75;
        damageTarget2(enemyCharacter, damagePoints);
    };

    // ---------------------------------------------------------------------------------//
    // -- Display Stats --//
    public void Display(Character Display) {
        Display();
    };
}
