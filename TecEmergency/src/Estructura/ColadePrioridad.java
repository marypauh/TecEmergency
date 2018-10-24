package Estructura;

public class ColadePrioridad<X>{

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
    public Pacientes dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        Pacientes temp = this.front.getNext().getElement();
        Node<Pacientes> nTemp = this.front.getNext();
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

    @Override
    public String toString(){
        String result = "";
        Node<Pacientes> tFront = this.front;
        int tSize = this.size;
        while(tSize != 0){
            result+= tFront.getNext().getElement().toString();
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }
    public static ColadePrioridad bubbleSort(ColadePrioridad cola) {
          Pacientes[] arr = new Pacientes[cola.size];
          int j = 0;
          while(cola.size>0){
              arr[j] = cola.dequeue();
              j++;
          }
          boolean swapped = true;
          Pacientes tmp;
          while (swapped) {
                swapped = false;
                for (int i = 0; i < arr.length - 1; i++) {
                      if (arr[i].prioridad > arr[i + 1].prioridad) {
                            tmp = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = tmp;
                            swapped = true;
                      }
                }
          }
          for(int k=0; k<arr.length;k++){
            cola.enqueue(arr[k]);
          }
        return cola;
    }
}