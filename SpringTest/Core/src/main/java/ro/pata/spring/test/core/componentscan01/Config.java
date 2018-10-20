package ro.pata.spring.test.core.componentscan01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"ro.pata.spring.test.core.componentscan01"})
@ComponentScan(basePackageClasses = {CompactDisk.class})
public class Config {
}
