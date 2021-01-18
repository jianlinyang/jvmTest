import java.util.concurrent.TimeUnit;

/**
 * @author YangJianlin
 * @date 2021/1/18 16:39
 */
public class MyTestMain {
    public MyTestMain() {
    }

    public static void main(String[] args) throws InterruptedException {
        while(true) {
            System.out.println(foo());
            TimeUnit.SECONDS.sleep(3L);
        }
    }

    public static int foo() {
        return 100;
    }
}
