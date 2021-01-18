import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author YangJianlin
 * @date 2021/1/18 11:11
 */

public class MyClassFileTransformer implements ClassFileTransformer {
    public MyClassFileTransformer() {
    }

    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] bytes) throws IllegalClassFormatException {
        if (!"MyTestMain".equals(className)) {
            return bytes;
        } else {
            ClassReader cr = new ClassReader(bytes);
            ClassWriter cw = new ClassWriter(cr, 2);
            ClassVisitor cv = new MyClassVisitor(cw);
            cr.accept(cv, 6);
            return cw.toByteArray();
        }
    }
}

