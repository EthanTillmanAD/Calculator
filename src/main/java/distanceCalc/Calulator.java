package distanceCalc;

import java.util.Scanner;

public class Calulator {
    public static double Numbs;

    public static void main(String[] args) {

        CalcIfs Calc = new CalcIfs();
        // creating an instance from
        // CalcIfs class to this one

        double dist1 = 2;
        double dist2 = 5;
        double dist3 = 10;
        double dist4 = 15;
        double dist5 = 20;
        double p;



        if ((Calc.distance >= 0 && Calc.distance <= 5)) {


            Calc.x = dist1;

            p = dist1;
            System.out.print(Calc.firstPart);
            System.out.print(p);
            System.out.print(Calc.secondPart);
            System.out.println(Calc.eqz + dist1);

        }
        if ((Calc.distance >= 6 && Calc.distance <= 15)) {



            Calc.x = dist2;

            p = dist2;
            System.out.print(Calc.firstPart);
            System.out.print(p);
            System.out.print(Calc.secondPart);
            System.out.println(Calc.eqz + dist2);


        }
        if ((Calc.distance >= 16 && Calc.distance <= 25)) {


            Calc.x = dist3;

            p = dist3;
            System.out.print(Calc.firstPart);
            System.out.print(p);
            System.out.print(Calc.secondPart);
            System.out.println(Calc.eqz + dist3);


        }
        if ((Calc.distance >= 26 && Calc.distance <= 50)) {


            Calc.x = dist4;

            p = dist4;
            System.out.print(Calc.firstPart);
            System.out.print(p);
            System.out.print(Calc.secondPart);
            System.out.println(Calc.eqz + dist4);


        } if (Calc.distance > 50){


            Calc.x = dist5;

                p = dist5;
                System.out.print(Calc.firstPart);
                System.out.print(p);
                System.out.print(Calc.secondPart);
                System.out.println(Calc.eqz + dist5);

        }

    }

}