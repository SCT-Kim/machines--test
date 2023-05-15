package machines.test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import machines.test.Type1Application;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { Type1Application.class })
public class CucumberSpingConfiguration {}
