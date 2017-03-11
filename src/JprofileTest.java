/**
 * Created by bacon on 2017/3/11.
 */
public class JprofileTest extends Thread{
    public static void main(String[] args)throws InterruptedException{
        JprofileTest test = new JprofileTest();
        for(int i = 1; i < 10000; i++)
        {
            new HelloWorld();
            test.sleep(100);
        }
    }

}

class HelloWorld{
    public HelloWorld(){
        System.out.println("Hello Jprofile!");
    }
}
