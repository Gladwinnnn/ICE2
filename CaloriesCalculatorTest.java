public class CaloriesCalculatorTest {
    public static void main(String[] args) {

        // part a
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts",82.5,20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa",115,28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters",56.5,13);

        // part b
        System.out.println(tart.getName() + " more sinful than " + bakKwa.getName() + ":" + tart.isMoreSinful(bakKwa));

        // part c
        double tartCaloriesPerGram = tart.getCaloriesPerGram();
        double bakKwaCaloriesPerGram = bakKwa.getCaloriesPerGram();
        double loveLettersCaloriesPerGram = loveLetters.getCaloriesPerGram();

        System.out.printf(tart.getName() + " (calories per gram) :" + "%.2f" , tartCaloriesPerGram);
        System.out.println();
        System.out.printf(bakKwa.getName() + " (calories per gram) :" + "%.2f", bakKwaCaloriesPerGram);
        System.out.println();
        System.out.printf(loveLetters.getName() + " (calories per gram) :" + "%.2f", loveLettersCaloriesPerGram);
        System.out.println();

        // part d
        CaloriesCalculator calorieCalculator = new CaloriesCalculator();

        // part e
        calorieCalculator.addNewYearGoodie(tart,2);
        calorieCalculator.addNewYearGoodie(bakKwa,3);
        calorieCalculator.addNewYearGoodie(loveLetters,5);
        double totalCalories = calorieCalculator.getTotalCalories();
        System.out.printf("Total Calories :%.2f", totalCalories);
        System.out.println();
        System.out.println("Most sinful goodie :" + calorieCalculator.getMostSinfulGoodie().getName());
    }
}
