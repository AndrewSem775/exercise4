import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> avgTemps = new ArrayList<>();
        Map<String, Integer> cityMap = new HashMap<String, Integer>();

        String city = "";

        while(!(city.equals("END"))) {
            System.out.println("Name a city");
            city = input.nextLine();
            if(city.equals("END"))
                break;
            cities.add(city);
        }
        System.out.println(cities);

        for(int i=0; i<cities.size(); i++) {
            System.out.println("what is the first temp for "+ cities.get(i));
            int num1 = input.nextInt();
            System.out.println("what is the second temp for "+ cities.get(i));
            int num2 = input.nextInt();
            System.out.println("what is the third temp for "+ cities.get(i));
            int num3 = input.nextInt();
            System.out.println("what is the fourth temp for "+ cities.get(i));
            int num4 = input.nextInt();
            System.out.println("what is the fifth temp for "+ cities.get(i));
            int num5 = input.nextInt();
            int avg = calculations(num1,num2,num3,num4,num5);
            avgTemps.add(avg);
        }
        for(int i=0; i<cities.size(); i++){
            cityMap.put(cities.get(i), avgTemps.get(i));

        }


        idkManSomething(cityMap);






    }





    public static Scanner input = new Scanner(System.in);

    public static int calculations (int a, int b, int c, int d, int e) {
        a = (a+b+c+d+e)/5;
        return a;
    }
    public static void idkManSomething (Map a){
        System.out.println(a);
    }


}