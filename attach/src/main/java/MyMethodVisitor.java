import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AdviceAdapter;

/**
 * @author YangJianlin
 * @date 2021/1/18 11:07
 */
public class MyMethodVisitor extends AdviceAdapter {
    protected MyMethodVisitor(MethodVisitor methodVisitor, int access, String name, String descriptor) {
        super(458752, methodVisitor, access, name, descriptor);
    }

    protected void onMethodEnter() {
        this.mv.visitIntInsn(16, 50);
        this.mv.visitInsn(172);
    }
}