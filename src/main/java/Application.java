
import com.lititzeRepo.Interface.Controller.DummyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration

 @ComponentScan(basePackageClasses = DummyController.class)

public class Application {

    public static void main (String args[] )throws Exception{
        SpringApplication.run(Application.class,args);
    }
}
