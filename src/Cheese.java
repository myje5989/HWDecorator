
public class Cheese extends Seasoning {

	Menu menu;
	public Cheese(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return ""+menu.getDescription() + " , Cheese";
	}
	public double cost(){
		return 0.25 + menu.cost();
	}
}
