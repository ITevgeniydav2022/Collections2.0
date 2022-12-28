package product;

import java.util.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        Product apple = new Product("Яблоко", 145, 10);
        Product orange = new Product("Апельсин", 410, 2);
        Product banana = new Product("Банан", 150, 10);
        Product cheese = new Product("Сыр", 300, 2);
        Product meat = new Product("Мясо", 480, 4);

        Set<Product> productSet = new HashSet<>();
        ProductList productList = new ProductList(productSet);
        productList.add(apple);
        productList.add(meat);
        productList.add(orange);
        productList.add(cheese);
        productList.add(banana);

        System.out.println();

        // Задание 2
        System.out.println("Задание 2");

        Recipe fish = new Recipe(productList, 2000, "Рыбный");
        Recipe fruit = new Recipe(productList, 3000, "Фруктовый");
        Recipe meat1 = new Recipe(productList, 2500, "Мясной");

        Set<Recipe> recipeSet = new HashSet<>();
        RecipeList recipeList = new RecipeList(recipeSet);
        recipeList.add(fish);
        recipeList.add(fruit);
        recipeList.add(meat1);


        // Задание 3
        System.out.println("Задание 3");

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
