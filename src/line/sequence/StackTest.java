package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-09 7:34 下午
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 @ClassName StackTest
 @Description TODO
 @Author liyalei
 @Date 2022/3/9  7:34 下午
 @Version 1.0
 **/
public class StackTest {

    //进制转换
    public static void converse(int N, int r){
        //SequenceStack<Integer> sequenceStack = new SequenceStack<Integer>();
        LinkStack<Integer> linkStack = new LinkStack<Integer>();
        while (N != 0){
            linkStack.push(N % r);
            N = N/r;
        }
        while(!linkStack.isEmpty()){
            System.out.print(linkStack.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        Integer num, toNum;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input a num:");
        num = Integer.parseInt(bufferedReader.readLine());
        System.out.println("please input toNum");
        toNum = Integer.parseInt(bufferedReader.readLine());
        converse(num, toNum);
    }

    //括号匹配


    //表达式求值
}
