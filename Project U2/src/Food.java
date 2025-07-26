    import java.util.ArrayList;
public class Food {
    String foodType;
    double foodQual;

    public Food(String foodType, double foodQual){
        this.foodQual=foodQual;
        this.foodType=foodType;
    }

    ArrayList<Food> stock = new ArrayList<Food>();
    double foodQuals[]={0.91,0.86,0.82,0.88,0.70};
    public void foodSorter(Food test){
        switch(test.foodType){
            case "egg":
                foodTest(1,test);
                break;
            case "fruit":
                foodTest(2,test);
                break;
            case "vegetable":
                foodTest(3,test);
                break;
            case "meat":
                foodTest(4,test);
                break;
            case "bread":
                foodTest(5,test);
                break;
        }
    }

    public void foodTest(int type, Food thing){
        if(thing.foodQual>foodQuals[type]){
            stock.add(thing);
        }
    }
}
    /*
     * Prompt: you have to restock your food every 7 days
     * you sell eggs, fruit, vegetables, meat, bread
     * check for several foods and checking their quality, which scales for 0 to 1
     * 
     * Pseudo Code
     * variable for foodType and foodQual
     * make constructor and set both
     * 
     * check for foodType, and for each foodType, check for certain foodQual's
     * 
     */