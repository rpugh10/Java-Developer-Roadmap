package com.example.mapPractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)throws CountryNotFound{
        Map<String, String> countries = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Enter three countries and their ISO codes: ");
            String countryName = scan.nextLine();
            String iso = scan.nextLine();

            countries.put(countryName, iso);
        }

        System.out.println("Enter a country to find: ");
        String findCountry = scan.nextLine();

        try {
            if(!countries.containsKey(findCountry)){
                throw new CountryNotFound("Country not found");
            }
            else{
                System.out.println(findCountry + " is in the map");
            }
            
        } catch (CountryNotFound e) {
            e.printStackTrace();
        }

        System.out.println("Enter a country to remove: ");
        String removeCountry = scan.nextLine();

        try {
            if(!countries.containsKey(removeCountry)){
                throw new CountryNotFound("Country not found");
            }
            else{
                countries.remove(removeCountry);
                System.out.println("Final country list " + countries);
            }
            
        } catch (CountryNotFound e) {
            e.printStackTrace();
        }
    }
}
