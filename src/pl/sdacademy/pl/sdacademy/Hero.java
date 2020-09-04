package pl.sdacademy;

import java.util.Scanner;

public class Hero {

    private String name = "unnamed_hero";
    private Sex sex = Sex.MALE;
    private float health = 0;
    private int strength = 0;
    private int stamina = 0;
    private int dexterity = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
    private float mana = 0;
    private float baseDamage = 0;
    private float baseBlock = 0;
    private int coins = 0;
    private float movementSpeed = 0f;
    private Buff buffs = null;

    public void setName(String name) {
        this.name = name;
    }

    public void applyDamage(byte amount) {
        System.out.println("Dealing " + amount + " damage");
        health -= amount;

        // when hero is dead
        if (health < 0) {
            health = 0;

            System.out.println("Hero: " + name + " is dead!");
        }
    }

    public void heroName() {

        // hero name

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hero name?");
        String heroName = scanner.nextLine();
        name = heroName;
        System.out.println("Your Hero name is: " + name);

        // hero sex

        System.out.println("Hero sex?");
        for (Sex sexVal : Sex.values()) {
            System.out.println(sexVal);
        }

        String scanSex = scanner.next();
        Sex heroSex = Sex.valueOf(scanSex.toUpperCase());
        sex = heroSex;


        switch (sex) {
            case MALE: {
                strength += 10;
                stamina += 10;
            }
            break;
            case FEMALE: {
                dexterity += 10;
                intelligence += 10;
            }
            break;
            case OTHER: {
                charisma += 10;
                wisdom += 10;
            }
            break;
            default: {
                System.out.println("ERROR! Please choose proper sex: Male, Female or Other");
            }
        }


// todo separate instances for hero stats
    }

    public int heroStgh() {
        // hero strength
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero strength?");
        int heroStghSc = scanner.nextInt();
        strength += heroStghSc;
        System.out.println("Your Hero strength is: " + strength);
        return strength;
    }


    public int heroStm() {
        // hero stamina
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero stamina?");
        int heroStmSc = scanner.nextInt();
        stamina += heroStmSc;
        System.out.println("Your Hero stamina is: " + stamina);
        return stamina;
    }

    public int heroDex() {
        // hero dexterity
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero dexterity?");
        int heroDexSc = scanner.nextInt();
        dexterity += heroDexSc;
        System.out.println("Your Hero dexterity is: " + dexterity);
        return dexterity;
    }

    public int heroInt() {
        // hero intelligence
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero intelligence?");
        int heroInt = scanner.nextInt();
        intelligence += heroInt;
        System.out.println("Your Hero intelligence is: " + intelligence);
        return intelligence;
    }

    public int heroWis() {
        // hero wisdom
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero wisdom?");
        int heroWis = scanner.nextInt();
        wisdom += heroWis;
        System.out.println("Your Hero wisdom is: " + wisdom);
        return wisdom;
    }

    public int heroCHar() {
        // hero charisma
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Hero charisma?");
        int heroChar = scanner.nextInt();
        charisma += heroChar;
        System.out.println("Your Hero charisma is: " + charisma);
        return charisma;
    }

    public void heroStatsCalc() {
        // hero stats calc
        baseDamage = (float) (strength * 0.1);
        baseBlock = (float) (dexterity * 0.1);
        movementSpeed = (float) (stamina * 0.1);
        health = (float) (strength * 0.5) + (float) (stamina * 0.2) + (float) (dexterity * 0.1);
        mana = (float) (intelligence * 0.5) + (float) (wisdom) + (float) (stamina * 0.1);
    }

    public void printInfo() {
        System.out.println("===== HERO =====\n" +
                "name: " + name +
                "\nsex: " + sex +
                "\nhealth: " + health +
                "\nmana: " + mana +
                "\nstrength: " + strength +
                "\nbaseDamage: " + baseDamage +
                "\nbaseBlock: " + baseBlock +
                "\nmovementSpeed: " + movementSpeed +
                "\ncoins: " + coins +
                "\nbuffs: " + buffs +
                "\n"
        );
    }
}
