// this is for Q8
public class CounterTest {
    public static void main(String[] args){
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(7);

        System.out.println("Before increment - First Counter value: " + firstCounter.getValue());    
        for (int i = 0; i < 5; i++){
            firstCounter.increment();
        }
        System.out.println("After incrementing 5 times - First Counter value: " + firstCounter.getValue());

        System.out.println("Before decrement - Second Counter value: " + secondCounter.getValue());
        secondCounter.decrement();
        System.out.println("After decrement - Second Counter: " + secondCounter.getValue());

        secondCounter.reset();
        System.out.print("After reset - Second Counter value: " + secondCounter.getValue());
    }

}