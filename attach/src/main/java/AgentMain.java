import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author YangJianlin
 * @date 2021/1/18 11:14
 */
public class AgentMain {
    public AgentMain() {
    }

    public static void agentmain(String agentArgs, Instrumentation inst) throws ClassNotFoundException, UnmodifiableClassException {
        System.out.println("agentmain called");
        inst.addTransformer(new MyClassFileTransformer(), true);
        Class[] classes = inst.getAllLoadedClasses();

        for(int i = 0; i < classes.length; ++i) {
            if (classes[i].getName().equals("MyTestMain")) {
                System.out.println("Reloading: " + classes[i].getName());
                inst.retransformClasses(new Class[]{classes[i]});
                break;
            }
        }

    }
}
