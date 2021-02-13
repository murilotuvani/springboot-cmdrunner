package test.cmd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class RunnerThree implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running Runner Three");
	}

}
