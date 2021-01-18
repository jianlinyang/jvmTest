import com.sun.tools.attach.VirtualMachine;

/**
 * @author YangJianlin
 * @date 2021/1/18 16:37
 */
public class MyAttachMain {
    public MyAttachMain() {
    }

    public static void main(String[] args) throws Exception {
        //args[0]=jps pid
        String path = System.getProperty("user.dir");
        VirtualMachine vm = VirtualMachine.attach(args[0]);
        String fullPath = path + "\\attach\\target\\attach-1.0-SNAPSHOT-jar-with-dependencies.jar";
        try {
            vm.loadAgent(fullPath);
        } finally {
            vm.detach();
        }
    }
}
