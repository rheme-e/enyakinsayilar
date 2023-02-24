package HarmonikOrt;

import java.util.Arrays;
import java.util.Scanner;

public class enyakinsayilar {
    public static void main(String[] args) {
        int[] list = {23,22,15,9,135,-2,-45,65,8};
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir Değer Giriniz:");
        int number=inp.nextInt();
        Arrays.sort(list);
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i <= number) {
                min = i;
            }
            if (i >= number) {
                max = i;
                break;
            }

        }
        System.out.println(Arrays.toString(list));
        System.out.println("Girilen sayıdan en küçük değer:"+min);
        System.out.println("Girilen sayıdan en büyük değer:"+max);


    }


}
