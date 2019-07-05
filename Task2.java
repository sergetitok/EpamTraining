import java.lang.management.ManagementFactory;

public class Task2 {

    public static void main(String[] args) {
        int ax = 1;
        int ay = 1;

        int bx = 1;
        int by = 6;

        int cx = 6;
        int cy = 0;
        triangleVerif(ax, ay, bx, by, cx, cy);

        int dragonAge = 365;
        dragonHeadCalc(dragonAge);

        char letter = 'a';

        vovelCheck1(letter);

        int day = 28;
        int month = 8;
        int year = 1993;
        dateSwitcher(day, month, year);


    }

    public static void triangleVerif(int ax, int ay, int bx, int by, int cx, int cy) {

        double ab = Math.sqrt(Math.abs(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2)));
        double bc = Math.sqrt(Math.abs(Math.pow((bx - cx), 2) + Math.pow((by - cy), 2)));
        double ac = Math.sqrt(Math.abs(Math.pow((cx - ax), 2) + Math.pow((cy - by), 2)));

        if (ab < (bc + ac) && (ac < (ab + bc)) && (bc < (ac + ab))) {
            if (ab == Math.sqrt(Math.abs(Math.pow(ac, 2) + Math.pow(bc, 2)))
                    || bc == Math.sqrt(Math.abs(Math.pow(ac, 2) + Math.pow(ab, 2)))
                    || ac == Math.sqrt(Math.abs(Math.pow(ab, 2) + Math.pow(bc, 2))))
                System.out.println("The points are vertex of the triangle. The triangle is right");
            else System.out.println("The points are vertex of the triangle");

        } else System.out.println("The points are not vertex of the triangle");
    }


    public static void dragonHeadCalc(int dragonAge) {

        int numHeads = 3;
        int eyes = 2;

        int youngDragon = 200;
        int adultDragon = 300;
        if (dragonAge <= 200) {
            numHeads += dragonAge * 3;
        } else if (dragonAge > youngDragon && dragonAge <= adultDragon) {
            numHeads += ((dragonAge - youngDragon) * 2) + (youngDragon * 3);
        } else if (dragonAge > adultDragon) {
            numHeads += (dragonAge - adultDragon) + ((dragonAge - youngDragon) * 2) + (youngDragon * 3);
        }
        int numEyes = numHeads * eyes;

        System.out.println("The dragon has " + numHeads + " heads and " + numEyes + " eyes");
    }


    public static void vovelCheck(char letter) {

        char[] vovelsArr = new char[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};

        for (int i = 0; i < vovelsArr.length; i++) {

            if (vovelsArr[i] == letter) {
                System.out.println("The letter " + letter + "is  vovel.");
                break;
            } else {
                System.out.println("The letter " + letter + "is not  vovel.");
            }
        }
    }

    public static void vovelCheck1(char letter) {
        switch (letter) {
            case 'a':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            case 'e':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            case 'o':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            case 'i':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            case 'u':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            case 'y':
                System.out.println("The letter " + letter + " is vovel.");
                break;
            default:
                System.out.println("The letter " + letter + " is not  vovel.");

        }


    }
    public static void dateSwitcher(int day, int month, int year) {

        int nextDay=day+1;
        int numberOfDays=0;


        if (month>0 && month<=12 && day > 0 && day<= 31 && year>0 ) {
            switch (month) {
                case 1:
                    numberOfDays = 31;
                    break;
                case 2:

                    if (year % 4 == 0 && year % 100 != 0 || year % 4 == 00 && year % 100 == 0 && (year % 400 == 0)) {
                        numberOfDays = 29;
                    } else {
                        numberOfDays = 28;
                    }

                case 3:
                    numberOfDays = 31;
                    break;

                case 4:
                    numberOfDays = 30;
                    break;

                case 5:
                    numberOfDays = 31;
                    break;

                case 6:
                    numberOfDays = 30;
                    break;

                case 7:
                    numberOfDays = 31;
                    break;

                case 8:
                    numberOfDays = 31;
                    break;

                case 9:
                    numberOfDays = 30;
                    break;

                case 10:
                    numberOfDays = 31;
                    break;

                case 11:
                    numberOfDays = 30;
                    break;

                case 12:
                    numberOfDays = 31;
                    break;


            }
            if (numberOfDays > day && month < 12) {
                System.out.println("The next date is " + nextDay + "." + month + "." + year);
            } else if (numberOfDays == day && month < 12) {
                nextDay = 1;
                month += 1;
                System.out.println("The next date is " + nextDay + "." + month + "." + year);
            } else if (numberOfDays == day && month == 12) {
                nextDay = 1;
                month = 1;
                year += 1;
                System.out.println("The next date is " + nextDay + "." + month + "." + year);
            }
        }
        System.out.println("You set the wrong date, please set proper date");

    }

}












