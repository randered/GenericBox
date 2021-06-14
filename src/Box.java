public class Box<T> {

    public T Value;

    public Box (T value){
    this.Value = value;
    }

    @Override
    public String toString() {

        return Value.getClass().getName() + " : " + Value;

    }
}
