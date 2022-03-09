package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 6:55 下午
 */

import org.omg.CORBA.Object;

/**
 @ClassName SequenceStack
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  6:55 下午
 @Version 1.0
 **/
public class SequenceStack<T> {
    private final int MaxSize = 1000;
    private T[] stackList;
    private int top;

    public SequenceStack() {
        top = -1;
        stackList = (T[])new Object[MaxSize];
    }

    public SequenceStack(int n) {
        if(n < 0){
            System.out.println("error length");
            System.exit(1);
        }
        top = -1;
        stackList = (T[])new Object[n];
    }

    public void push(T obj){
        //越界需要进行扩容
        if(top == stackList.length-1){
            T[] tmpStack = (T[])new Object[2 * top + 2];
            for(int i = 0; i <= top; i++){
                tmpStack[i] = stackList[i];
            }
            stackList = tmpStack;
        }
        top++;
        stackList[top] = obj;
    }

    public T pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return null;
        }

        top--;
        return stackList[top+1];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public T getHead(){
        if(top == -1){
            System.out.println("stack is empty");
            return null;
        }
        return stackList[top];
    }

    public int size(){
        return top+1;
    }

    public void nextOrder(){
        for(int i = top; i >= 0; i--){
            System.out.print(stackList[i] + " ");
        }
        System.out.println();
    }

    public void clear(){
        top = -1;
    }
}


