package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 3:41 下午
 */

/**
 @ClassName SequenceListTest
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  3:41 下午
 @Version 1.0
 **/
public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<Integer> sequenceList = new SequenceList<Integer>();
        int pos,res,i;
        int a[] = {23, 12, 15, 20, 26};
        for(i = 0; i < a.length; i++){
            sequenceList.insert(a[i], i+1);
        }
        sequenceList.nextOrder();
        sequenceList.insert(30, 4);
        sequenceList.nextOrder();
        res = sequenceList.delete(2);
        System.out.println(res);
        sequenceList.nextOrder();
        pos = sequenceList.find(26);
        System.out.println(pos);
    }
}
