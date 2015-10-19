package example.spring.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FooDoer {

    @Value("${message}")
    private String message;

    @Autowired
    private Foo foo;

    public void doTheFoo() {
        System.out.println(message);
        foo.doFoo();
    }
}
