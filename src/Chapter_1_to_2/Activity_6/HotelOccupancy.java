//**********************************************************************************************************************
//                              Activity 5
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters amount of floors in a hotel. Enters amount of rooms on each floor, and the occupancy of each flor.
//  Returns total room count along with Occupancy, vacancy, and occupancy rate+%.
//
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_6;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int floors=0,total=0,occupied=0,occupancyRate;
        System.out.println("How many floors?: ");
        floors=ask.nextInt();
        for(int i=1;i<=floors;i++){
            System.out.printf("\nRooms on floor %d?: ",i);
            total+=ask.nextInt();
            System.out.println("Rooms occupied?: ");
            occupied+=ask.nextInt();
        }
        occupancyRate = (int)((float)occupied/total*100);
        System.out.printf(
            "\nFloors: %d\nRooms: %d\nOccupied: %d\nVacant: %d\nOccupancy Rate: %.2f(%d%%)",floors,total,occupied,total-occupied,(float)occupied/total,occupancyRate
        );
    }
}
