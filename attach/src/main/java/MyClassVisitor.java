import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM7;

/**
 * @author YangJianlin
 * @date 2021/1/18 11:10
 */
public class MyClassVisitor extends ClassVisitor {

    public MyClassVisitor(ClassVisitor classVisitor) {
        super(458752, classVisitor);
    }

    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
        return (MethodVisitor)("foo".equals(name) ? new MyMethodVisitor(mv, access, name, descriptor) : mv);
    }
}
