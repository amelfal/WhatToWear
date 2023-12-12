public class WhatToWear
{
    // access modifiers
    //incorporates use of access modifiers and nomenclature + throughout program
    private String weather;
    private String occasion;
    private String top;
    private String pants;
    // static variable
    public static int outfitsCreated = 0;

    // default constructor using "this" connotation
    public WhatToWear()
    {
        this.weather = "";
        this.occasion = "";
        this.top = "";
        this.pants = "";
        outfitsCreated++;
    }

    // full constructor using "this" connotation
    public WhatToWear(String weather, String occasion, String top, String pants)
    {
        this.weather = weather;
        this.occasion = occasion;
        this.top = top;
        this.pants = pants;
        outfitsCreated++;
    }

    // getters
    public String getWeather()
    {
        return weather;
    }

    public String getOccasion()
    {
        return occasion;
    }

    public String getTop()
    {
        return top;
    }

    public String getPants()
    {
        return pants;
    }

    // setters
    public void setWeather(String weather)
    {
        this.weather = weather;
    }

    public void setOccasion(String occasion)
    {
        this.occasion = occasion;
    }

    public void setTop(String top)
    {
        this.top = top;
    }

    public void setPants(String pants)
    {
        this.pants = pants;
    }

    // toString method
    public String toString()
    {
        return "\nYou indicated that: " +
                "\nThe weather is: " + weather  +
                "\nThe occasion is: " + occasion +
                "\nYour top: " + top +
                "\nYour pants: " + pants +
                "\n----------------------------";
    }

    // brain methods
    // static method
    public static String weatherCheck(String inputWeather)
    {
        if (inputWeather.equalsIgnoreCase("hot"))
        {
            return "It's too hot outside.";
        } else if (inputWeather.equalsIgnoreCase("cold"))
        {
            return "It's too cold outside.";
        } else {
            return "The weather is good.";
        }
    }

    public static boolean isFancy(String inputOccasion)
    {
        return inputOccasion.equalsIgnoreCase("fancy");
    }

    public static boolean isCasual(String inputOccasion)
    {
        return inputOccasion.equalsIgnoreCase("casual");
    }

    public static boolean isSchool(String inputOccasion)
    {
        return inputOccasion.equalsIgnoreCase("school");
    }

    public static boolean isHome(String inputOccasion)
    {
        return inputOccasion.equalsIgnoreCase("home");
    }

    public static String suggestOutfitChangeForCasualOccasion(String occasion, String weather)
    {
        if (isCasual(occasion))
        {
            if (weather.equalsIgnoreCase("hot"))
            {
                return "For a casual event in hot weather, consider wearing a lightweight, breathable top and shorts or a skirt.";
            } else if (weather.equalsIgnoreCase("cold"))
            {
                return "For a casual event in cold weather, consider wearing a warm jacket or sweater and pants or long pants.";
            } else
            {
                return "The current weather is " + weather + ", which is suitable for a casual event.";
            }
        }

        return "";
    }

    public static String suggestOutfitChangeForFancyOccasion(String occasion, String weather)
    {
        if (isFancy(occasion))
        {
            if (weather.equalsIgnoreCase("hot"))
            {
                return "For a fancy event in hot weather, consider wearing a lightweight, breathable dress and sandals or open-toe shoes.";
            } else if (weather.equalsIgnoreCase("cold"))
            {
                return "For a fancy event in cold weather, consider wearing a warm jacket or sweater and dress pants or long pants.";
            } else
            {
                return "The current weather is " + weather + ", which is suitable for a fancy event.";
            }
        }
        return "";
    }
}