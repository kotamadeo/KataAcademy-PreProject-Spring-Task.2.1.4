package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle8 {
    private Death9 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле \uD83D\uDE2D!" + death.toString();
    }

    @Autowired
    public void setDeath(Death9 death) {
        this.death = death;
    }
}
