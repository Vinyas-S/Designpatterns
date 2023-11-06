package designpatters.singleton;

public class ChocaolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocaolateBoiler uniqueInstance;

    private ChocaolateBoiler(){
        empty =false;
        boiled = false;
    }

    public static ChocaolateBoiler getInstance(){
        if(uniqueInstance == null){
            synchronized (ChocaolateBoiler.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new ChocaolateBoiler();
            }
        }
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) { // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
