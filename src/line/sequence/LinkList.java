package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 4:19 下午
 */

/**
 @ClassName LinkList
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  4:19 下午
 @Version 1.0
 **/
public class LinkList<T> {
    private Node<T> head;
    private int length;

    //构造空链表
    public LinkList() {
        length = 0;
        head = new Node<T>(null);
    }

    //获取头节点
    public Node<T> getHead(){
        return this.head;
    }

    public boolean insert(T obj, int pos){
        if(pos < 1 || pos > length+1){
            System.out.println("error pos");
            return false;
        }
        int num = 1;
        Node<T> p = head, q = head.next;
        while(num < pos){
            p = q;
            q = p.next;
            num++;
        }
        p.next = new Node<T>(obj, q);
        length++;
        return true;
    }

    public T delete(int pos){
       if(isEmpty()){
           System.out.println("linkList is empty!");
           return null;
       }else {
           if(pos < 1 || pos > length+1){
               System.out.println("error pos");
               return null;
           }
           int num = 1;
           Node<T> p = head, q = head.next;
           while(num < pos){
               p = q;
               q = p.next;
               num++;
           }
           p.next = q.next;
           length--;
           return q.data;
       }
    }

    public T value(int pos){
        if(isEmpty()){
            System.out.println("linkList is empty!");
            return null;
        }else {
            if (pos < 1 || pos > length + 1) {
                System.out.println("error pos");
                return null;
            }
            int num =1;
            Node<T> q=head.next;
            while(num < pos){
                q=q.next;
                num++;
            }
            return q.data;
        }
    }

    /**
     * == 的作用：
     * 　　基本类型：比较值是否相等
     * 　　引用类型：比较内存地址值是否相等
     *
     * equals 的作用:
     * 　　引用类型：默认情况下，比较内存地址值是否相等。可以按照需求逻辑，重写对象的equals方法。
     * @param obj
     * @return
     */

    public int find(T obj){
        if(isEmpty()){
            System.out.println("linkList is empty!");
            return -1;
        }
        int num =1;
        Node<T> q = head.next;
        while (q != null){
            if(q.data.equals(obj) == false){
                q = q.next;
                num++;
            }else
                break;
        }
        if(q == null) return -1;
        return num;
    }

    public boolean modify(T obj, int pos){
        if(isEmpty()){
            System.out.println("linkList is empty!");
            return false;
        }else {
            if (pos < 1 || pos > length + 1) {
                System.out.println("error pos");
                return false;
            }
            int num =1;
            Node<T> q=head.next;
            while(num < pos){
                q=q.next;
                num++;
            }
            q.data = obj;
            return true;
        }
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int size(){
        return length;
    }

    public void nextOrder(){
        Node<T> q = head.next;
        while(q != null){
            System.out.print(q.data + " ");
            q = q.next;
        }
        System.out.println();

    }

    public void clear(){
        length = 0;
        head.next = null;
    }
}
