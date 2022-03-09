package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 3:51 下午
 */

/**
 @ClassName CompareableList
 @Description 两个有序线性表，合并成为新的有序线性表
 @Author liyalei
 @Date 2022/3/9  3:51 下午
 @Version 1.0
 **/
public class CompareableList {
    public static <T extends Comparable>void MergeList(SequenceList<T> La, SequenceList<T> Lb, SequenceList<T> Lc){
        int i=1, j=1, k=1;
        while(i <= La.size() && j <= Lb.size()){
            if(La.value(i).compareTo(Lb.value(j)) < 0){
                Lc.insert(La.value(i), k);
                i++;
            }else {
                Lc.insert(Lb.value(j), k);
                j++;
            }
            k++;
        }
        while(i < La.size()){
            Lc.insert(La.value(i), k);
            i++;
            k++;
        }
        while(j < Lb.size()){
            Lc.insert(Lb.value(j), k);
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 15, 19, 30, 45};
        int[] b = {2, 19, 82};
        int i, j;
        SequenceList<Integer> La = new SequenceList<Integer>();
        SequenceList<Integer> Lb = new SequenceList<Integer>();
        SequenceList<Integer> Lc = new SequenceList<Integer>();
        for(i = 0; i < a.length; i++){
            La.insert(a[i], i+1);
        }
        La.nextOrder();

        for(j = 0; j<b.length; j++){
            Lb.insert(b[j], j+1);
        }
        Lb.nextOrder();
        MergeList(La, Lb, Lc);
        Lc.nextOrder();

    }
}
