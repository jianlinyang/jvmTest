/**
 * @author YangJianlin
 * @date 2021/1/18 11:06
 */
public class MyTest {
    //vm options -javaagent:path\agent\target\agent-1.0-SNAPSHOT-jar-with-dependencies.jar
    public static void main(String[] args) {
        new MyTest().foo();
    }
    public void foo() {
        bar1();
        bar2();
    }

    public void bar1() {
    }

    public void bar2() {
    }
}
