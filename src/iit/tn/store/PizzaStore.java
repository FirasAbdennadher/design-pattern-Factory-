package iit.tn.store;

import iit.tn.factory.PizzaIngredientFactory;
import tn.iit.pizza.Pizza;

public abstract class PizzaStore {
	
	protected PizzaIngredientFactory factory;
	protected String store;
	
	public PizzaStore(PizzaIngredientFactory factory,String store) {
		this.factory=factory;
		this.store=store;
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		return pizza;
	}

	protected abstract Pizza createPizza(String type);

}
