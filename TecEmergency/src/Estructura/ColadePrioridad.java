package Estructura;

public class ColadePrioridad<Pacientes> {

    private Node<Pacientes> front;
    private Node<Pacientes> rear;
    private int size;

    public ColadePrioridad(){
        this.front = new Node<>();
        this.rear = this.front;
        this.size = 0;
    }
    public void enqueue(Pacientes paciente){
        this.rear.setNext(new Node<>(paciente, null));
        this.rear = rear.getNext();
        this.size++;
    }
    /*public T dequeue(){
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
    */
    
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
        Node<Pacientes> tFront = this.front;
        int tSize = this.size;
        while(tSize != 0){
            result+= tFront.getNext().getElement();
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }   
}