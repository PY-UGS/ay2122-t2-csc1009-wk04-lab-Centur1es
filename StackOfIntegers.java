package T4;

public class StackOfIntegers {
    private int elements[];
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }
    public int peek(){
        return this.elements[size-1];
    }

    public void push(int value){
        this.elements[size++] = value;

    }
    public int pop(){
        return this.elements[--size];
    }

    public int getSize() {
        return size;
    }

}

