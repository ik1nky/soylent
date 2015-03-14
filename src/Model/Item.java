package Model;

import java.net.URL;
import java.util.Map;

/**
 * Created by ik1nk_000 on 3/13/2015.
 */
public class Item
{
    //Defines
    private static final double GRAMS_IN_OUNCE = 0.035274;
    private static final int OUNCES_IN_POUND = 16;
    private static final int MILLIGRAMS_IN_GRAMS = 1000;


    //Object Values
    private String name;
    private String description;
    private int id;

    private double servingSize;
    private double numberOfServings;

    private URL productPage;

    private Map<String,Double> nutrition;  //The string is a nutrition name such as iron or calories and its value is the amount in grams
    private String[] ingredients;  //This is the ingredients that make up the ingredients. IE coke is made of sugar, water, sucrose, etc.

    public Item(){

    }

    public String getName(){return this.name;}
    public String getDescription(){return this.description;}
    public int getId(){return this.id;}
    public double getServingSize(){return this.servingSize;}
    public double getNumberOfServings(){return this.numberOfServings;}
    public URL getProductPage(){return this.productPage;}
    public Map<String,Double> getNutrition(){return this.nutrition;}
    public String[] getIngredients(){return this.getIngredients();}

    public void setName(String pName){this.name = pName;}
    public void setDescription(String pDesc){this.description = pDesc;}
    public void setId(int pId){this.id = pId;}
    public void setServingSize(double pSize){this.servingSize = pSize;}
    public void setNumberOfServings(double pSize){this.numberOfServings = pSize;}
    public void setProductPage(URL pURL){this.productPage = pURL;}
    public void setNutrition(Map<String,Double> pNutrition){this.nutrition = pNutrition;}
    public void setIngredients(String[] pIng){this.ingredients = pIng;}

    //Grams <--> Ounces
    public double convertGramsToOunces(double grams){
        return grams/GRAMS_IN_OUNCE;
    }
    public double convertOuncesToGrams(double ounces){
        return ounces*GRAMS_IN_OUNCE;
    }

    //Ounces <--> Pounds
    public double convertOuncesToPounds(double ounces){
        return ounces/OUNCES_IN_POUND;
    }
    public double convertPoundsToOunces(double pounds){
        return pounds*OUNCES_IN_POUND;
    }

    //Milligrams <--> Grams
    public double convertMilligramsToGrams(double milligrams){
        return milligrams/MILLIGRAMS_IN_GRAMS;
    }
    public double convertGramsToMilligrams(double grams){
        return grams*MILLIGRAMS_IN_GRAMS;
    }

    //Grams <--> Pounds
    public double convertGramsToPounds(double grams){
        return convertOuncesToPounds(convertGramsToOunces(grams));
    }
    public double convertPoundsToGrams(double pounds){
        return convertOuncesToGrams(convertPoundsToOunces(pounds));
    }

    //Milligrams <--> Ounces
    public double convertMilligramsToOunces(double milligrams){
        return convertMilligramsToGrams(convertGramsToOunces(milligrams));
    }
    public double convertOuncesToMilligrams(double ounces){
        return convertOuncesToGrams(convertGramsToMilligrams(ounces));
    }
}
