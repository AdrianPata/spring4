package ro.pata.spring.test.core.componentscan01;

import org.springframework.stereotype.Component;

@Component("specialCD")
public class SgtPeppers implements CompactDisk {
    public void play() {
        System.out.println("Play SgtPeppers");
    }
}
