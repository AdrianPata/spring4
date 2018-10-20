package ro.pata.spring.test.core.componentscan01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
