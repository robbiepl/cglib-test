package cglib;

import cglib.domain.GenericRequest;
import cglib.domain.ResponseAbstract;

public interface SimpleInterface<T extends GenericRequest> {

    ResponseAbstract handle(T request);

}
