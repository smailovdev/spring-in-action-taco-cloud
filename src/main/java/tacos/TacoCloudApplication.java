package tacos;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import tacos.data.IngredientRepository;
import tacos.Ingredient.Type;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return args -> {
            repo.save(new Ingredient("1","FLTO", "Flour Tortilla", Type.WRAP));
            repo.save(new Ingredient("2","COTO", "Corn Tortilla", Type.WRAP));
            repo.save(new Ingredient("3","GRBF", "Ground Beef", Type.PROTEIN));
            repo.save(new Ingredient("4","CARN", "Carnitas", Type.PROTEIN));
            repo.save(new Ingredient("5","TMTO", "Diced Tomatoes", Type.VEGGIES));
            repo.save(new Ingredient("6","LETC", "Lettuce", Type.VEGGIES));
            repo.save(new Ingredient("7","CHED", "Cheddar", Type.CHEESE));
            repo.save(new Ingredient("8","JACK", "Monterrey Jack", Type.CHEESE));
            repo.save(new Ingredient("9","SLSA", "Salsa", Type.SAUCE));
            repo.save(new Ingredient("10","SRCR", "Sour Cream", Type.SAUCE));
        };
    }

}
