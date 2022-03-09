package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 7:15 下午
 */

/**
 @ClassName LinkStack
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  7:15 下午
 @Version 1.0
 **/
public class LinkStack<T> {
    private Node<T> top;
    private int length;

    public LinkStack() {
        length = 0;
        top = null;
    }

    public void push(T obj){
        top = new Node<T>(obj, top);
        length++;
    }

    public T pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }
        T res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public T getHead(){
        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void nextOrder(){
        Node<T> p = top;
        if(p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void clear(){
        top = null;
        length = 0;
    }
}
