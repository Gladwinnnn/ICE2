// this is for Q8
public class Counter {
    private int value;

    public Counter(){
        this.value = 0;
    }

    public Counter(int v){
        this.value = v;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

    public void reset(){
        value = 0;
    }
}