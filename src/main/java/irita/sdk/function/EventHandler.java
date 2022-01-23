package irita.sdk.function;

import java.io.IOException;

@FunctionalInterface
public interface EventHandler<T>  {
    void accept(T t) throws IOException;
}
