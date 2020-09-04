package pl.sdacademy;

import java.util.Scanner;

public class heroBuilder {

    private int skillPoints = 100;

    public void buildHero() {
        Scanner scanner = new Scanner(System.in);
        Hero build = new Hero();

        build.heroName();


        do {
            System.out.println("You have " + skillPoints + " skill points uses them wisely.");
            skillPoints -= build.heroStgh();
            System.out.println("You have " + skillPoints + " skill points left.");
            skillPoints -= build.heroStm();
            System.out.println("You have " + skillPoints + " skill points left.");
            skillPoints -= build.heroDex();
            System.out.println("You have " + skillPoints + " skill points left.");
            skillPoints -= build.heroInt();
            System.out.println("You have " + skillPoints + " skill points left.");
            skillPoints -= build.heroWis();
            System.out.println("You have " + skillPoints + " skill points left.");
            skillPoints -= build.heroCHar();
            if (skillPoints < 0) {
                skillPoints = 100;
                System.out.println("You have used too much skill points. Try again!");
            } else {
                continue;
            }

        } while (build.heroStgh() > 0 &&
                build.heroStm() > 0 &&
                build.heroDex() > 0 &&
                build.heroInt() > 0 &&
                build.heroWis() > 0 &&
                build.heroCHar() > 0);


        build.heroStatsCalc();
        build.printInfo();
    }

}
