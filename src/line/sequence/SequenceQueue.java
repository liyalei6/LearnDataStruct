package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-10 8:58 上午
 */

import org.omg.CORBA.Object;

/**
 @ClassName SequenceQueue
 @Description TODO
 @Author liyalei
 @Date 2022/3/10  8:58 上午
 @Version 1.0
 **/
public class SequenceQueue<T> {
    private final int MaxSize=100;
    private int front, rear;
    private T[]  queueList;

    public SequenceQueue() {
        front = rear = 0;
        queueList = (T[])new Object[MaxSize];
    }

    public void Enqueue(T obj){
        //队列满，扩容
        if((rear + 1) % queueList.length == front){
            T[] tempQueue = (T[])new Object[queueList.length * 2];

            //单个队列满的情况
            if(rear == queueList.length - 1){
                for(int i = 1; i <= rear; i++){
                    tempQueue[i] = queueList[i];
                }
            }else {
                int i, j=1;
                for(i = front + 1; i < queueList.length; i++, j++){
                    tempQueue[j] = queueList[i];
                }
                for(i = 0; i <= rear; i++, j++){
                    tempQueue[j] = queueList[i];
                }
                front = 0;
                rear = queueList.length - 1;
            }

            queueList = tempQueue;
        }

        rear = (rear + 1) % queueList.length;
        queueList[rear] = obj;

    }

    public T deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        front = (front+1)%queueList.length;
        return queueList[front];
    }

    public int size(){
        return (rear-front+queueList.length)%queueList.length;
    }

    public T getTop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return queueList[(front + 1) % queueList.length];
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void nextOrder(){
        int i, j= front;
        for(i = 1; i < size(); i++){
            j = (j + 1) % queueList.length;
            System.out.print(queueList[j]);
        }
        System.out.print(" ");
    }

    public void clear(){
        front = rear = 0;
    }
}
