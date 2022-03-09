package set;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 3:00 下午
 */

/**
 @ClassName Set
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  3:00 下午
 @Version 1.0
 **/
public class Set<T> {
    private final int MaxSize = 20;
    private T[] elements;
    private int length;

    public Set(T[] elements, int length) {
        this.elements = elements;
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public boolean insert(){
        return true;
    }

    public boolean delete(){
        return true;
    }
}
