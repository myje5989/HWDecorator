
public class Spicy extends Seasoning {
	Menu menu;
	public Spicy(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return menu.getDescription() + " , Spicy";
	}
	public double cost(){
		return 0.50 + menu.cost();
	}

}
