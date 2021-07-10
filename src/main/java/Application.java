import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tgroy.model.Speaker;
import com.tgroy.service.SpeakerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		List<Speaker> speakers = service.findAll();
		
		System.out.println("name: " + speakers.get(0).getFirstName());
		System.out.println("seed: " + speakers.get(0).getSeed());

		System.out.println("Ending the application now");
		((ConfigurableApplicationContext) appContext).close();
	}
}
