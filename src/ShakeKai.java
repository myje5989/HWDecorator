
public class ShakeKai {
Menu beverage;
	public static void main(String[] args) {
		Menu b1 = new DrumstickChicken();
		System.out.println(b1.getDescription() +  " $ "+ b1.cost());
		
		Menu b2 = new CheeseBall();
		b2 = new Spicy(b2);
		b2 = new Bbq(b2);
		System.out.println(b2.getDescription() +  " $ "+ b2.cost());
		
		Menu b3 = new Frenfry();
		b3 = new Paprika(b3);
		b3 = new Bbq(b3);
		b3 = new Cheese(b3);
		System.out.println(b3.getDescription() +  " $ "+ b3.cost());
		Menu b4 = new KaiPop();
		b4 = new Spicy(b4);
		b4 = new Cheese(b4);
		System.out.println(b4.getDescription() +  " $ "+ b4.cost());
		
	}

}
