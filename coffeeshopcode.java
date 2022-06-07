import java.util.ArrayList;

public class coffeeshopcode {
	String barName;
	int price;
	
	public coffeeshopcode(String name, int number) {

		 this.barName = name;
		 this.price = number;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.barName;
	}
	
	public static void main(String args[]) {
		
		ArrayList<coffeeshopcode> barList = new ArrayList<coffeeshopcode>();
		
		coffeeshopcode Bents = new coffeeshopcode("Bents", 1);
		coffeeshopcode Cstone = new coffeeshopcode("Cstone", 2);
		coffeeshopcode Looneys = new coffeeshopcode("Looneys", 3);
		coffeeshopcode Turf = new coffeeshopcode("Turf", 4);
		coffeeshopcode Frats = new coffeeshopcode("Frats", 0);
		
	    barList.add(Bents);
	    barList.add(Cstone);
	    barList.add(Looneys);
	    barList.add(Turf);
	    barList.add(Frats);
	    for(int i = 0; i < barList.size()-1; i++) {   
	        System.out.print(barList.get(i).getName() + " $" + barList.get(i).getPrice() + ", ");	        
	    }  
	    System.out.print(barList.get(barList.size()-1).getName() + " $" + barList.get(barList.size()-1).getPrice());
	}
}
