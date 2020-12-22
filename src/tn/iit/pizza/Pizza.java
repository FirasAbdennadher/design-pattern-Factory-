package tn.iit.pizza;

import tn.iit.ingredient.Sauce;

public abstract class Pizza {
	
	protected Sauce sauce;
	protected String name;
	public abstract void prepare();
	
	public void cut() {
		System.out.println("cut en 2 min");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
