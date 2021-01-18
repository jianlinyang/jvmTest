import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author YangJianlin
 * @date 2021/1/18 11:14
 */
public class AgentMain {
    public static void premain(String agentArgs, Instrumentation inst) throws ClassNotFoundException, UnmodifiableClassException {
        inst.addTransformer(new MyClassFileTransformer(), true);
    }
}
