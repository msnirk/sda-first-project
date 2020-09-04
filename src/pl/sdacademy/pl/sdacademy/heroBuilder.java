package pl.sdacademy;

import java.util.Scanner;

public class heroBuilder {

    private int skillPoints = 100;

    public void buildHero() {
        Scanner scanner = new Scanner(System.in);
        Hero build = new Hero();

        build.heroName();

        System.out.println("You have " + skillPoints + " skill points uses them wisely.");
 /*       build.heroStgh(0);
        for (build.heroStgh(0); build.heroStgh() <= 0; skillPoints -= scanner.nextInt()) {
            System.out.println("You have "+ skillPoints + " skill points left.");
        }
            build.heroStm();
            build.heroDex();
            build.heroInt();
            build.heroWis();
            build.heroCHar();

            for (int sP=skillPoints; sP <= 0; sP=0 ) {
                System.out.println("You have used all your skill points.");

            }


   */     }

    }
//todo take out seperate instances for build