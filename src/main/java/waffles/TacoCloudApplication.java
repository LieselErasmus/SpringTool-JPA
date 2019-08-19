package waffles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import waffles.Ingredient.Type;
import waffles.data.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args);
  }

  @Bean
  public CommandLineRunner dataLoader(IngredientRepository repo) {
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        repo.save(new Ingredient("REG", "Regular Waffle", Type.WRAP));
        repo.save(new Ingredient("BEL", "Belgium Waffle", Type.WRAP));
        repo.save(new Ingredient("CRM", "Cream", Type.PROTEIN));
        repo.save(new Ingredient("ICRM", "Ice Cream", Type.PROTEIN));
        repo.save(new Ingredient("SRWB", "Strawberries", Type.VEGGIES));
        repo.save(new Ingredient("BNN", "Banana", Type.VEGGIES));
        repo.save(new Ingredient("HUND", "100/1000s", Type.CHEESE));
        repo.save(new Ingredient("VERM", "Vermicielli", Type.CHEESE));
        repo.save(new Ingredient("CRML", "Caramel", Type.SAUCE));
        repo.save(new Ingredient("HNY", "Honey", Type.SAUCE));
      }
    };
  }
  
}
