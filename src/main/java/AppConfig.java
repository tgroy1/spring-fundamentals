import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tgroy.util.CalendarFactory;

@Configuration
@ComponentScan({ "com.tgroy" })
public class AppConfig {

	@Bean(name = "cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}

	@Bean
	public Calendar cal() throws Exception {
		return calFactory().getObject();
	}

//	@Bean(name = "speakerService")
//	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
//	public SpeakerService getSpeakerService() {
//		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
//		//service.setRepository(getSpeakerRepository());
//		return service;
//	}

//	@Bean(name = "speakerRepository")
//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerRepositoryImpl();
//	}

}
