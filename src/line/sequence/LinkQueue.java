package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-10 9:42 上午
 */

/**
 @ClassName LinkQueue
 @Description TODO
 @Author liyalei
 @Date 2022/3/10  9:42 上午
 @Version 1.0
 **/
public class LinkQueue<T> {
    private Node<T> front, rear;
    private int length;

    public LinkQueue() {
        front = rear = new Node<T>(null);
        length = 0;
    }

    public void enQueue(T obj){
        rear = rear.next = new Node<T>(obj, null);
        length++;
    }

    public T deQueue(){
        if(isEmpty()){
            System.out.print("Queue is Empty");
            return null;
        }
        Node<T> res = front.next;
        front.next = res.next;
        length--;
        if(front.next == null)
            rear = front;
        return res.data;
    }

    public T getHead(){
        if(isEmpty()){
            System.out.print("Queue is Empty");
            return null;
        }
        Node<T> res = front.next;
        return res.data;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return front.next == null;
    }

    public void nextOrder(){
        Node<T> res = front.next;
        while(res!=null){
            System.out.print(res.data);
            res = res.next;
        }
        System.out.println();
    }

    public void clear(){
        rear.next = front.next = null;
        length = 0;
    }
}
