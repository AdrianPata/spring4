package ro.pata.spring.test.core.componentscan01;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class SgtPeppersTest {

    //http://stefanbirkner.github.io/system-rules/index.html
    @Rule
    public final SystemOutRule out = new SystemOutRule().mute().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired(required = false)
    private CompactDisk cd;

    @Test
    public void shouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        String l=out.getLog();

        assertEquals("Play SgtPeppers",out.getLog().trim());
    }
}