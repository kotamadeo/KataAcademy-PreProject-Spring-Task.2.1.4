package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit5 {
    private final Duck6 duck5;

    @Autowired
    public Rabbit5(Duck6 duck5) {
        this.duck5 = duck5;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck5.toString();
    }
}
