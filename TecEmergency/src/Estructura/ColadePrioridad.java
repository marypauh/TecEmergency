package Estructura;

public class ColadePrioridad<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public ColadePrioridad(){
        this.front = new Node<>();
        this.rear = this.front;
        this.size = 0;
    }
    public void enqueue(T element){
        this.rear.setNext(new Node<>(element, null));
        this.rear = rear.getNext();
        this.size++;
    }
    public T dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        T temp = this.front.getNext().getElement();
        Node<T> nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp){
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Object first(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getElement();
    }
    
    public int size(){
        return this.size;
    }

    public void clear(){
        this.front = new Node<>();
        this.rear = this.front;
        this.size = 0;
    }

    public String toString(){
        String result = "";
        Node<T> tFront = this.front;
        int tSize = this.size;
        while(tSize != 0){
            result+= tFront.getNext().getElement();
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }   
}