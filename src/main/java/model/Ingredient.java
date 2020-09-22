package model;

import java.io.Serializable;

// we want this class to represent a burger ingredient
public class Ingredient implements Serializable {

    //  Create all properties, with correct access type (public/protected/private)

    // 1. long id
    private long id;
    // 2. string name
    private String name;
    // 3. int quantity
    private int quantity;

    // define what color the bell pepper is
    // boolean isYellow;
    // boolean isGreen;
    // boolean isRed;
    // boolean isMulticolor;
    // If we had to have a boolean for every color that exists, we would have WAY too many properties for this single "characteristic" that we are trying to define
    // Instead, we should just make a separate bean called "Color" to define all the different colors we can have, while keeping only a single property (ingredientColor) in the Ingredient Bean

    // private Color ingredientColor;

    // boolean isNews;
    // boolean isComedy;
    // boolean isDiy;
    // Again, if we had fifty categories, we wouldn't want to have to update every single instance of an Ingredient every time we add a new category to our app.
    // Rather, just create a new Bean called "Category" that can define all the categories, and all we reference here is the single property "category" - which references an instance of the "Category" class (Bean)

    // private Category category;


    // Create a zero-argument constructor
    public Ingredient() {}

    // Create a constructor with all properties except the ID
    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Create all getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
