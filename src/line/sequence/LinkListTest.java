package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 4:54 下午
 */

import java.util.List;

/**
 @ClassName LinkListTest
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  4:54 下午
 @Version 1.0
 **/
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<Integer>();
        int pos,res,i;
        int a[] = {23, 12, 15, 20, 26};
        for(i = 0; i < a.length; i++){
            linkList.insert(a[i], i+1);
        }
        linkList.nextOrder();
        linkList.insert(30, 4);
        linkList.nextOrder();
        res = linkList.delete(2);
        System.out.println(res);
        linkList.nextOrder();
        pos = linkList.find(26);
        System.out.println(pos);
        //linkList.clear();
    }
}
