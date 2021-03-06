package cglib;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleTest {

    public static void main(String[] args) {
        List<Method> methods = new ArrayList();

        //https://github.com/google/guice/blob/master/core/src/com/google/inject/internal/ProxyFactory.java#L90

        Enhancer.getMethods(SimpleHandler.class, null, methods);
        for (Method m : methods) {
            System.out.println(m.toString() + " " + Arrays.toString(m.getAnnotations()) );
        }
    }
}
