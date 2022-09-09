//**********************************************************************************************************************
//                              Activity 5
//                              Name: Antone Thygerson
//                              Date: 9/07/2022
//**********************************************************************************************************************
//  User enters if a member of their party/group is a vegetarian,Vegan, or glutenfree.
//  Based on their inputs they are recommended a restaurant from a specific criteria.
//  If they aren't vegetarian but are vegan and glutenfree, they're out of luck.
//**********************************************************************************************************************
package Chapter_1_to_2.Activity_5;
import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        Restaurant[] restaurants = {
                new Restaurant("Joe's Gourmet Burgers",false,false,false),
                new Restaurant("Main Street Pizza Company",true,false,true),
                new Restaurant("Corner Cafe",true,true,true),
                new Restaurant("Mama's Fine Italian",true,false,false),
                new Restaurant("The Chef's Kitchen",true,true,true)
        };
        boolean vegetarian,vegan,gluten;
        System.out.print("\nVegetarian?: ");
        vegetarian=input(ask.next());
        System.out.print("\nVegan?: ");
        vegan=input(ask.next());
        System.out.print("\nGluten Allergy?: ");
        gluten=input(ask.next());
        System.out.println("Potential Restaurants: ");
        for(Restaurant r: restaurants){
            if(r.isVegetarian()==vegetarian&&r.isVegan()==vegan&&r.isGlutenFree()==gluten){
                System.out.printf("\n   %s",r.getName());
            }
        }
    }
    public static boolean input(String s){
        if(s.equals("yes")){
            return true;
        }
        return false;
    }
    private static class Restaurant{
        String name;
        boolean vegetarian, vegan, glutenFree;
        public Restaurant(String name, boolean vegetarian, boolean vegan, boolean glutenFree){
            this.name=name;
            this.vegetarian=vegetarian;
            this.vegan=vegan;
            this.glutenFree=glutenFree;
        }
        public String getName(){
            return this.name;
        }
        public boolean isVegetarian() {
            return vegetarian;
        }
        public boolean isVegan() {
            return vegan;
        }
        public boolean isGlutenFree() {
            return glutenFree;
        }
    }
}
