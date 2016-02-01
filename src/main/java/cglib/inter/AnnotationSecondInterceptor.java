package cglib.inter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.LoggerFactory;


public class AnnotationSecondInterceptor implements MethodInterceptor {

    org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    static int counter = 0;

    public final Object invoke(final MethodInvocation invocation) throws Throwable {
        Object proceed = null;
        counter++;
        LOGGER.info("BEFORE : {} {}", counter, invocation.getThis());
        try {
            proceed =  invocation.proceed();
        } catch (final Exception e) {
            e.printStackTrace();
        }
        LOGGER.warn("AFTER : {} {}", counter, invocation.getThis());
        return proceed;
    }
}
