package iit.tn.factory;
import tn.iit.ingredient.Sauce;
import tn.iit.ingredient.SauceTmatem;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Sauce CreateSauce() {
		return new SauceTmatem();
		
	}

	}
