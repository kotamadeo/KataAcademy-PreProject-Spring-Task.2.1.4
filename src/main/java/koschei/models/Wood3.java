package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Chest4 chest;

    @Autowired
    public Wood3(Chest4 chest) {
        this.chest = chest;
    }

    @Override
    public String toString() {
        return ", на дереве сундук " + chest.toString();
    }
}
