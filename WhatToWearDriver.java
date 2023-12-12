// This program titled "WhatToWear" helps users to determine if their given outfit is appropriate, based on the weather and occasion.
// This is accomplished through a scanner class, which asks the user to categorize the weather and occasion, and also input their top and pants.
// The program outputs the information the user gives, along with a suggestion to change their outfit based on the weather and if it is appropriate for the occasion.

import java.util.Scanner;

public class WhatToWearDriver
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the \"Fit Check\" application! I can help you determine if your outfit is appropriate based on the weather and occasion.");

        // prompts user to input outfit ideas
        System.out.println("What is the weather like today? Please enter if it is \"cold\", \"cool\", or \"hot\" outside: ");
        String weather = scanner.nextLine();

        System.out.println("What is the occasion? Enter if the event is \"casual\", \"fancy\", \"school\", \"home\", \"party\", or \"professional\": ");
        String occasion = scanner.nextLine();

        System.out.println("What top are you wearing? Please enter if it is a \"blouse\", \"coat\", \"dress shirt\", \"hoodie\", \"long-sleeve shirt\", \"sweater\", or a \"t-shirt\": ");
        String top = scanner.nextLine();

        System.out.println("What pants are you wearing? Enter \"dress pants\", \"jeans\", \"khakis\", \"shorts\", or a \"skirt\": ");
        String pants = scanner.nextLine();

        // instantiation of three objects
        WhatToWear outfit1 = new WhatToWear(weather, occasion, top, pants);
        WhatToWear outfit2 = new WhatToWear("hot", "casual", "t-shirt", "shorts");
        WhatToWear outfit3 = new WhatToWear("cold", "fancy", "blouse", "dress pants");

        // output the outfits
        System.out.println(outfit1.toString());
        System.out.println(outfit2.toString());
        System.out.println(outfit3.toString());

        // categorize the outfit based on weather and occasion
        if (weather.equalsIgnoreCase("cold"))
        {
            System.out.println("It's cold outside.");
            if (WhatToWear.isFancy(occasion))
            {
                System.out.println("Wear a nice blouse, coat and dress pants.");
            } else if (WhatToWear.isCasual(occasion))
            {
                System.out.println("Wear a sweater and jeans.");
                System.out.println(WhatToWear.suggestOutfitChangeForCasualOccasion(occasion, weather));
            } else if (WhatToWear.isSchool(occasion))
            {
                System.out.println("Wear a jacket and khakis.");
            } else if (WhatToWear.isHome(occasion)) {
                System.out.println("Wear a hoodie and sweatpants.");
            } else if (occasion.equalsIgnoreCase("party"))
            {
                System.out.println("Wear a dress and wedges. Don't forget to bring a coat");
            } else if (occasion.equalsIgnoreCase("professional"))
            {
                System.out.println("Wear a blazer and dress pants.");
            }
        }

        else if (weather.equalsIgnoreCase("cool"))
        {
            System.out.println("It's cool outside.");
            if (WhatToWear.isFancy(occasion))
            {
                System.out.println("Wear a blazer and dress pants.");
                System.out.println(WhatToWear.suggestOutfitChangeForFancyOccasion(occasion, weather));
            } else if (WhatToWear.isCasual(occasion))
            {
                System.out.println("Wear a long-sleeve shirt and jeans.");
                System.out.println(WhatToWear.suggestOutfitChangeForCasualOccasion(occasion, weather));
            } else if (WhatToWear.isSchool(occasion))
            {
                System.out.println("Wear a sweater and khakis.");
            } else if (WhatToWear.isHome(occasion))
            {
                System.out.println("Wear a long-sleeve and sweatpants.");
            } else if (occasion.equalsIgnoreCase("party"))
            {
                System.out.println("Wear a dress and nice shoes.");
            } else if (occasion.equalsIgnoreCase("professional"))
            {
                System.out.println("Wear a blazer and dress pants.");
            }
        }

        else if (weather.equalsIgnoreCase("hot"))
        {
            System.out.println("It's hot outside.");
            if (WhatToWear.isFancy(occasion))
            {
                System.out.println("Wear a dress shirt and dress pants.");
                System.out.println(WhatToWear.suggestOutfitChangeForFancyOccasion(occasion, weather));
            } else if (WhatToWear.isCasual(occasion))
            {
                System.out.println("Wear a t-shirt and shorts.");
                System.out.println(WhatToWear.suggestOutfitChangeForCasualOccasion(occasion, weather));
            } else if (WhatToWear.isSchool(occasion))
            {
                System.out.println("Wear a cool shirt and khaki shorts.");
            } else if (WhatToWear.isHome(occasion))
            {
                System.out.println("Wear a tank top and shorts.");
            } else if (occasion.equalsIgnoreCase("party"))
            {
                System.out.println("Wear a sundress and sandals.");
            } else if (occasion.equalsIgnoreCase("professional"))
            {
                System.out.println("Wear a dress shirt and dress pants.");
            }
        }

        // use of string methods to suggest changes to the outfit
        if ((top.equalsIgnoreCase("hoodie") || top.equalsIgnoreCase("sweater")) && weather.equalsIgnoreCase("hot"))
        {
            System.out.println("Change the top, it's too hot for a hoodie or sweater.");
        }
        if (top.equalsIgnoreCase("t-shirt") && weather.equalsIgnoreCase("cold"))
        {
            System.out.println("Change the top, it's too cold for a t-shirt.");
        }
        if (pants.equalsIgnoreCase("jeans") && weather.equalsIgnoreCase("hot"))
        {
            System.out.println("Change the pants, it's too hot for jeans.");
        }
        if ((pants.equalsIgnoreCase("shorts") || pants.equalsIgnoreCase("skirt")) && weather.equalsIgnoreCase("cold"))
        {
            System.out.println("Change the pants, it's too cold for shorts or a skirt.");
        }

        // output the number of outfits created
        System.out.println("--------------------------\nNumber of outfits created: " + WhatToWear.outfitsCreated);
    }
}