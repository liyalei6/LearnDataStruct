package line.sequence;/**
 * @author liyalei
 * @description TODO
 * @date 2022-03-10 8:35 下午
 */

import sun.nio.cs.ext.MS874;

/**
 @ClassName MyString
 @Description TODO
 @Author liyalei
 @Date 2022/3/10  8:35 下午
 @Version 1.0
 **/
public class MyString {
    private char[] chars;
    private int length;
    private int MaxLength = 10;

    public MyString(int n) {
        this.length = 0;
        this.MaxLength = n;
        this.chars = new char[n];
    }

    public int compare(MyString t){
        int i = 0;
        while(this.chars[i] == t.chars[i] && i < this.length && i < t.length){
            i++;
        }
        if(i == this.length && i == t.length)
            return 0;                  //两个字符串相等
        else if(i == t.getLength() && i < this.length)
            return 1;
        else
            return -1;
    }

    public int getLength(){
        return this.length;
    }

    public void strcat(MyString t){
        if(this.MaxLength < this.length + t.length){
            //扩容
            char[] temp = new char[this.length];
            for(int i = 0; i < this.length; i++)
                temp[i] = this.chars[i];
            this.MaxLength = this.length + t.length;
            this.chars = new char[this.MaxLength];
            for(int i = 0; i < this.length; i++){
                this.chars[i] = temp[i];
            }
        }
        for(int i = 0; i < t.length; i++){
            this.chars[this.length] = t.chars[i];
            this.length++;
        }
    }

    public MyString subString(int pos, int len){
        if(pos + len >= this.length){
            return null;
        }
        MyString res = new MyString(len);
        for(int i = 0; i < len; i++){
            res.chars[i] = this.chars[pos + i];
            res.length ++;
        }
        return res;
    }

    public void copy(MyString t){
        if(this.MaxLength < t.MaxLength){
            this.MaxLength = t.MaxLength;
            this.chars = new char[this.MaxLength];
        }
        this.length = 0;
        for(int i = 0; i < t.length; i++){
            this.chars[i] = t.chars[i];
            this.length++;
        }
    }

    public int index(MyString t){
        if(this.length < t.length)
            return -1;
        int a = -1;
        for(int i = 0; i < this.length; i++){
            int j = 0;
            while(j < t.length && this.chars[i+j] == t.chars[j]){
                if(this.chars[i+j] != t.chars[j])
                    break;
                j++;
            }
            if(j == t.getLength()){
                a = i;
                break;
            }
        }
        return a;
    }
}
