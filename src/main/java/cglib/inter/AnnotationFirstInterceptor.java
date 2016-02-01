package cglib.inter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.LoggerFactory;

public class AnnotationFirstInterceptor implements MethodInterceptor {

    static int counter = 0;
    org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object proceed = null;
        counter++;
        LOGGER.warn("BEFORE : {} {}", counter, invocation.getThis());
        try {
            proceed = invocation.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.warn("AFTER : {} {}", counter, invocation.getThis());
        return proceed;
    }

}
