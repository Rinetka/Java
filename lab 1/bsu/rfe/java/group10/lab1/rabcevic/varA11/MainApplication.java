package bsu.rfe.java.group10.lab1.rabcevic.varA11;

public class MainApplication {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0; 
		for (String arg: args) {
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese(parts[1]);
			} else
			if (parts[0].equals("Apple")) {
				breakfast[itemsSoFar] = new Apple(parts[1]);
			} else
			if (parts[0].equals("Eggs")) {
				breakfast[itemsSoFar] = new Eggs(parts[1]);
			}
			itemsSoFar++;
		}
		
        Food sampleFood = new Eggs("");
        int count = countFoodType(breakfast, sampleFood);
        System.out.println("Количество порций яиц в завтраке: " + count);
		
		for (Food item: breakfast)
		if (item!=null) {
			item.consume();
		}
		else
			break;
	}
	
    public static int countFoodType(Food[] breakfast, Food foodToCompare) {
        int count = 0;
        for (Food food : breakfast) {
            if (food != null && food.equals(foodToCompare)) {
                count++;
            }
        }
        return count;
    }
}

