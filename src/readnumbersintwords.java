import java.util.Scanner;
public class readnumbersintwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number;
        number = scanner.nextInt();
        int[]array = {0,1,2,3,4,5,6,7,8,9};
        String[]array1 ={"zero","one","two","three","for","five","six","seven","eight","nine"};
        if (number<10 && number> 0){
            for (int i =0;i<array.length;i++){
                if (number == array[i]){
                    System.out.println(array1[i]);
                }
            }
        }
        if (number >=10 && number <20){
            int[]a ={10,11,12,13,14,15,16,17,18,19};
            String[]b = {"ten","eleven","twelve","thirteen",
                    "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            for (int i =0;i<a.length;i++){
                if (number ==a[i]){
                    System.out.println(b[i]);
                }
            }
        }
        int hangtram = number/100;
        int hangchuc = (number - (hangtram*100))/ 10;
        int donvi = number - hangtram*100 -  hangchuc*10;
        if (20<number&& number<30){
            for (int i = 0;i<array.length;i++){
                if (donvi==array[i]){
                    System.out.println("twenty "+array1[i]);
                }
            }
        }
        if (50<number && number<60){
            for (int i =0;i<array.length;i++){
                if (donvi == array[i]){
                    System.out.println("fifty "+ array1[i]);
                }
            }
        }
        if (number>30&&number<40 || number>40&&number<50 ||number>60&&number<100){
            String c ="";
            String d ="";
            for (int i =0;i<array.length;i++){
                if (hangchuc==array[i]){
                     c = array1[i];
                }
            }for (int i =0;i<array.length;i++){
                if (donvi == array[i]){
                    d = array1[i];

                }
            }
            System.out.println(c+"ty "+ d);

        }
        if (number>100 && number<1000){
            String x = "";
            String y = "";
            String z = "";
            for (int i =0;i<array.length;i++) {
                if (hangtram == array[i]) {
                    x = array1[i];
                }
            }
                for (int i= 0;i<array.length;i++) {
                    if (hangchuc == array[i]) {
                        y = array1[i];
                    }
                }
                for (int i = 0;i<array.length;i++) {
                    if (donvi == array[i]) {
                        z = array1[i];
                    }
                }
            System.out.println(x +" hundred and " + y + " "+ z);

            }
        }

    }

