package tn.iit.pizza;

import iit.tn.factory.PizzaIngredientFactory;

public class CheesePizza  extends Pizza{

	private PizzaIngredientFactory ingredientFactory;
		public  CheesePizza(PizzaIngredientFactory factory) {
			this.ingredientFactory=factory;
		}
	@Override
	public void prepare() {
		
	}

}
