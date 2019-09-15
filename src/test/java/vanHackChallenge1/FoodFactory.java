package vanHackChallenge1;

public class FoodFactory extends Cuisine {
    public Cuisine getCuis() {
        return cuis;
    }

    public void setCuis(Cuisine cuis) {
        this.cuis = cuis;
    }

    //    private Object Chinese;
//    private Object Chinese;
    private Cuisine cuis;

//    public static FoodFactory getFactory() {
    public static FoodFactory getFactory() {
        FoodFactory ff = new FoodFactory();
        return ff;

    }

    public void registerCuisine(String dish, Cuisine cuisine) {
        cuis = new Cuisine();
        cuis.setDish(dish);
        cuis.setCuisine(cuisine);

    }

    public Cuisine serveCuisine(String cuisine, String dish) {
//        Cuisine cuis = new Cuisine();
        UnservableCuisineRequestException ex = new UnservableCuisineRequestException();
//        Cuisines c;
            cuis.setDish(dish);
        if(cuisine.equalsIgnoreCase("Chinese")){
            return (Chinese) cuis;
        }else if(cuisine.equalsIgnoreCase("Chinese")){
            return (Chinese) cuis;
        }else if(cuisine.equalsIgnoreCase("Chinese")){
            return (Chinese) cuis;
        }else if(cuisine.equalsIgnoreCase("Chinese")){
            return (Chinese) cuis;
        }else{
            ex.setMessage("Unservable cuisine " + cuisine + " for dish " + dish);
//            return ;
        }

//        if(cuisine.equalsIgnoreCase("Chinese")
//        cuisine.equalsIgnoreCase("Italian") ||
//                cuisine.equalsIgnoreCase("Japanese") ||
//                cuisine.equalsIgnoreCase("Mexican"))
        return cuis;
    }
}
