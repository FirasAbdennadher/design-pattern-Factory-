package iit.tn.store;

import iit.tn.factory.PizzaIngredientFactory;
import tn.iit.pizza.CheesePizza;
import tn.iit.pizza.Pizza;

public class ConcretePizzaStore extends PizzaStore{

	public ConcretePizzaStore(PizzaIngredientFactory factory, String store) {
		super(factory, store);
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza=null;
		if("cheese".equals(type))
			pizza=new CheesePizza(factory);
			pizza.setName(store +" Sfax style PizzaCheese ");
		return pizza;
	}

}
