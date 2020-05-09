package senior;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/921:53
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public abstract class paper {
    public void question1(){
        System.out.println("A1.a");
    }
    public void question2(){
        System.out.println("A2.b");
    }
    public  void  question3(){
        System.out.println("A3.c");
    }
    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();
}
