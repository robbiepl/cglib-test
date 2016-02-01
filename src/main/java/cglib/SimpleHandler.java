package cglib;


import com.google.inject.Singleton;
import cglib.domain.SomeRequest;
import cglib.domain.SomeResponse;
import cglib.inter.anon.AnnotationFirst;
import cglib.inter.anon.AnnotationSecond;

@Singleton
public class SimpleHandler implements SimpleInterface<SomeRequest> {

    protected SimpleHandler() {
    }

    @AnnotationFirst
    @AnnotationSecond
    public SomeResponse handle(SomeRequest request) {
        System.out.println("--- business code ---");
        return null;
    }

}
