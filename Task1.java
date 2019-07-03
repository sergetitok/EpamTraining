public class Task1 {

    public static void main(String[] args) {
        double a = 11;
        double b = 11;
        double c = 11;
        numberVerificator(a, b, c);

        double dinoWeightKg = 100;
        DinosaurWeightCalc(dinoWeightKg);

        double R1 = 10;
        double R2 = 5.5;
        ringSquare(R1,R2);

        int num1=1234;
        sequentor(num1);

        int num2 = 123456;
        avgCalculator(num2);

        int num3 = 1234567;
        reverseNumb(num3);



    }


    public static void numberVerificator(double a, double b, double c) {

        if (a == b && b == c) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
    public static void DinosaurWeightCalc(double dinoWeightKg){
        double dinoWeightMlgrams = dinoWeightKg*1_000_000;
        double dinoWeightGrams = dinoWeightKg*1000;
        double dinoWeightTonns = dinoWeightKg/1000;

        System.out.println("Dino mass is "+dinoWeightMlgrams+" mlgrs," +dinoWeightGrams+" grams, " +
                "" +dinoWeightTonns+" tonns");
    }

    public static void ringSquare(double rad1, double rad2){
        double PI = 3.14159;

        double sqr1 = rad1*rad1*PI;
        double sqr2 = rad2*rad2*PI;
        double ringSqr = sqr1-sqr2;
        System.out.println("Square of the ring is " +ringSqr+".");

    }
    public static void sequentor(int num1){

        if (num1>999 && num1<10000) {
            int firstDigit = num1/1000;
            int secondDigit = num1 / 100 % 10;
            int thirdDigit = num1 / 10 % 10;
            int fourthDigit = num1 % 10;

            if (firstDigit < secondDigit && secondDigit < thirdDigit && thirdDigit < fourthDigit){
                System.out.println("The digits of number " +num1+ " is forming an incremental sequence");
            }

            else if (firstDigit > secondDigit && secondDigit > thirdDigit && thirdDigit > fourthDigit){
                System.out.println("The digits of number " +num1+ "number is forming an decremental sequence");
            }
            else{
                System.out.println("The digits of number " +num1+ " is not forming sequence");
            }
        }
        else{
            System.out.println("The number is not correct");
        }
    }
    public static void avgCalculator(int num2){
        if (num2>99999&&num2<1000000){

        int[] arr1 = new int[6];
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = num2%10;
            num2 = num2 / 10;
        }
        double summ=0;
        for (int i = 0; i < arr1.length; i++){

            for(int j=0; i<arr1.length; i++) {
                summ=summ+arr1[i];
            }
        }
        double avgArif=summ/arr1.length;


        int mult=1;
        for (int i = 0; i <= arr1.length; i++){

            for(int j=0; i<arr1.length; i++) {
                mult=mult*arr1[i];
            }
        double avgGeo= Math.pow(mult,1.0/arr1.length);
        System.out.println(avgArif);
        System.out.println(avgGeo);
    }
        }
      else
            {
                System.out.println("The number is not correct");
            }
    }


    public static void reverseNumb(int num3) {
        int[] arr2 = new int[7];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = num3 % 10;
            num3 = num3 / 10;
        }
        System.out.print ("Reversed number is ");
        for (int j = 0; j <arr2.length; j++) {
            System.out.print(arr2[j]);

        }
    }
    }




