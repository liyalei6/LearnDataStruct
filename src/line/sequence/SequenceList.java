package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 3:09 下午
 */

import java.util.Objects;

/**
 @ClassName SequenceList
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  3:09 下午
 @Version 1.0
 **/
public class SequenceList<T>{
    private final int MaxLength = 100;
    private T[] listArray;
    private int length;

    //空构造函数
    public SequenceList() {
        this.length = 0;
        listArray = (T[])new Object[MaxLength];
    }

    //初始长度构造函数
    public SequenceList(int length) {
        if(length < 0){
            System.out.println("error length");
            System.exit(1);
        }
        this.length = 0;
        listArray = (T[])new Object[length];
    }

    //在线性表中插入一个元素
    public boolean insert(T obj, int pos){
        if(pos < 1 || pos > length+1){
            System.out.println("error pos");
            return false;
        }
        if(length == listArray.length){
            //2倍扩容
            T[] tmpArray = (T[])new Object[2*length];
            for(int i = 0; i < length; i++){
                tmpArray[i] = listArray[i];
                listArray = tmpArray;
            }
        }

        for(int i = length; i>=pos; i--){
            listArray[i] = listArray[i-1];
        }
        listArray[pos-1] = obj;
        length++;
        return true;
    }

    //在线性表中删除一个元素
    public  T delete(int pos){
        if(isEmpty()){
            System.out.println("empty list");
            return null;
            //System.exit(1);
        }else {
            if(pos < 1 || pos > length){
                System.out.println("error length");
                return null;
            }
            T res = listArray[pos-1];
            for(int i = pos; i <= length; i++){
                listArray[i-1] = listArray[i];
            }
            length--;
            return res;
        }
    }

    //修改某个位置元素的值
    public boolean modify(T obj, int pos){
        if(isEmpty()){
            System.out.println("empty list");
            return false;
            //System.exit(1);
        }else {
            if(pos < 1 || pos > length){
                System.out.println("error length");
                return false;
            }
            listArray[pos-1] = obj;
            return true;
        }
    }

    //在线性表中查找某个元素
    public int find(T obj){
        if(isEmpty()){
            System.out.println("empty list");
            return -1;
            //System.exit(1);
        }else {
            for(int i = 0; i < length; i++){
                if(listArray[i] == obj){
                    return i+1;
                }
            }
            return -1;
        }
    }

    //获取线性表中某个元素的值
    public T value(int pos){
        if(isEmpty()){
            System.out.println("empty list");
            return null;
            //System.exit(1);
        }else {
            if(pos < 1 || pos > length){
                System.out.println("error length");
                return null;
            }
            return listArray[pos-1];
        }
    }

    //判空
    public boolean isEmpty(){
        if(length == 0)
            return true;
        else
            return false;
    }

    //求线性表元素个数
    public int size(){
        return length;
    }

    //遍历线性表元素
    public void nextOrder(){
        for(int i=0; i < length; i++){
            System.out.print(listArray[i]+" ");
        }
        System.out.println();
    }

    //清空线性表
    public void clear(){
        length=0;
    }
}
