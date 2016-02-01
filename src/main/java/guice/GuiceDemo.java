package guice;

import cglib.SimpleInterface;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

public class GuiceDemo {

    public static void main(final String[] args) {

        Guice.createInjector(Stage.PRODUCTION, new Module())
                .getInstance(SimpleInterface.class)
                .handle(null);
    }
}
