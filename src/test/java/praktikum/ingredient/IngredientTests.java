package praktikum.ingredient;

import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.DataSet;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IngredientTests {

    private DataSet ds = new DataSet();
    private List<Ingredient> ingredients = new ArrayList<>();

    @Before
    public void setTestData() {
        for (int i = 0; i < ds.ingredientPrices.length; i++) {
            ingredients.add(new Ingredient(ds.types[i], ds.ingredientNames[i], ds.ingredientPrices[i]));
        }
    }

    @Test
    @DisplayName("Проверяем, что создаются новые ингредиеты")
    public void shouldWorkAddingIngredients() {
        int expected = ds.ingredientPrices.length;
        assertEquals(expected, ingredients.size());
    }

    @Test
    @DisplayName("Проверяем, что возвращается соответствующее название ингредиента")
    public void getNameMethodShouldReturnTheNameOfTheIngredient() {
        String expected = ds.ingredientNames[3];
        assertEquals(expected, ingredients.get(3).getName());
    }

    @Test
    @DisplayName("Проверяем, что возвращается соответствующая цена")
    public void getPriceMethodShouldReturnThePriceOfTheIngredient() {
        double expected = ds.ingredientPrices[1];
        assertEquals(expected, ingredients.get(1).getPrice(),0.1);
    }

    @Test
    @DisplayName("Проверяем установленный тип ингредиента")
    public void getTypeMethodShouldReturnTheIngredientsType() {
        IngredientType expected = IngredientType.FILLING;
        assertEquals(expected, ingredients.get(0).getType());
    }

    @Test
    @DisplayName("Проверяем кол-во типов инредиентов")
    public void getCountIngredientTypes() {
        int expected = 2;
        assertEquals(expected, IngredientType.values().length);
    }
    
    @After
    public void clearTestData() {
        ingredients.clear();
    }
}
