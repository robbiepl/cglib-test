package guice;

import cglib.SimpleHandler;
import cglib.SimpleInterface;
import cglib.inter.AnnotationFirstInterceptor;
import cglib.inter.AnnotationSecondInterceptor;
import cglib.inter.anon.AnnotationFirst;
import cglib.inter.anon.AnnotationSecond;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class Module extends AbstractModule {

    @Override
    protected void configure() {

        bind(SimpleInterface.class).to(SimpleHandler.class);

        final AnnotationFirstInterceptor firsInterceptor = new AnnotationFirstInterceptor();
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AnnotationFirst.class), firsInterceptor);
        requestInjection(firsInterceptor);

        final AnnotationSecondInterceptor secondInterceptor  = new AnnotationSecondInterceptor();
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(AnnotationSecond.class), secondInterceptor);
        requestInjection(secondInterceptor);


    }

}
