package builder.sample01.director;

import builder.sample01.builder.MealBuilder;
import builder.sample01.product.Meal;

public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal construct() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
