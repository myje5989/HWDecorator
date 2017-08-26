
public class Paprika extends Seasoning {

	Menu menu;
	public Paprika(Menu menu){
			this.menu = menu;
	}
	
	@Override
	public String getDescription() {
		return ""+menu.getDescription() + " , Paprika";
	}
	public double cost(){
		return 0.10 + menu.cost();
	}
}
