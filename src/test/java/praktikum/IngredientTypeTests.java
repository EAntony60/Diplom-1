package praktikum;


import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTests{

    private IngredientType ingredientType;

    @Test
    public void getIngredientTypes() {
        Assert.assertEquals("Нет Соуса в списке ингредиентов", "SAUCE", IngredientType.valueOf("SAUCE").toString());
        Assert.assertEquals("Нет Соуса в списке ингредиентов", "FILLING", IngredientType.valueOf("FILLING").toString());
    }

}