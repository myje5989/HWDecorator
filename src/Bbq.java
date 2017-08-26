
public class Bbq extends Seasoning {
	Menu menu;
	public Bbq(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return menu.getDescription()+", BBQ";
	}
	public double cost(){
		return 0.10 + menu.cost();
	}

}
