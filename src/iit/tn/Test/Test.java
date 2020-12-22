package iit.tn.Test;

import iit.tn.factory.PizzaIngredientFactory;
import iit.tn.factory.SfaxPizzaIngredientFactory;
import iit.tn.store.ConcretePizzaStore;
import iit.tn.store.PizzaStore;
import tn.iit.ingredient.Sauce;

public class Test {

	public static void main(String[] args) {

		PizzaStore p = new ConcretePizzaStore(new SfaxPizzaIngredientFactory(), "sfax");
		p.orderPizza("chesse");
		
	}

}
