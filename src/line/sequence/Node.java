package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 4:16 下午
 */

/**
 @ClassName Node
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  4:16 下午
 @Version 1.0
 **/
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
