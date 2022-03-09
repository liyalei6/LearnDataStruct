package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 5:02 下午
 */

/**
 @ClassName CompareableLink
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  5:02 下午
 @Version 1.0
 **/
public class CompareableLink {
    public static <T extends Comparable>void MergeList(LinkList<T> La, LinkList<T> Lb, LinkList<T> Lc) {
        Node<T> Linka, Linkb, Linkc;
        Linka = La.getHead().next;
        Linkb = Lb.getHead().next;
        Linkc = Lc.getHead();
        while(Linka != null && Linkb != null){
            if(Linka.data.compareTo(Linkb.data) < 0){
                Linkc.next = Linka;
                Linkc = Linka;
                Linka = Linka.next;
            }else {
                Linkc.next = Linkb;
                Linkc = Linkb;
                Linkb = Linkb.next;
            }
        }
        if(Linka != null){
            Linkc.next = Linka;
            Linkc = Linka;
            Linka = Linka.next;
        }
        if(Linkb != null){
            Linkc.next = Linkb;
            Linkc = Linkb;
            Linka = Linkb.next;
        }
        La.clear();
        Lb.clear();
    }


    public static void main(String[] args) {
        int[] a = {12, 15, 19, 30, 45};
        int[] b = {2, 19, 82};
        int i, j;
        LinkList<Integer> La = new LinkList<Integer>();
        LinkList<Integer> Lb = new LinkList<Integer>();
        LinkList<Integer> Lc = new LinkList<Integer>();
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
