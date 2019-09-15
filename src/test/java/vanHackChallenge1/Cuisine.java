package vanHackChallenge1;

public class Cuisine {


    private String dish;
    private Cuisine cuisine;

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getDish() {
        return dish;
    }
}
