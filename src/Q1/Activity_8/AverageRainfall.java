package Q1.Activity_8;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int years,months,totalRainfall=0;
        double avgRain,avgMonth;
        System.out.println("Number of years: ");
        years = ask.nextInt();
        months=years*12;
        for(int i=1;i<=years;i++){
            for(int o=1;o<=12;o++){
                System.out.printf("How much rain did you get in year %d, month %d",i,o);
                totalRainfall+=ask.nextInt();
            }
        }
        avgMonth=(double)totalRainfall/months;
        avgRain=(double)totalRainfall/years;
        System.out.printf("Average yearly rainfall is %.2f inches over %d years and monthly is %f over %d months",avgRain,years,avgMonth,months);
    }
}
