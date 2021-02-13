package test.cmd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CmdrunnerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(CmdrunnerApplication.class, args);
		// Faz shutdown da applicacao
		app.close();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running Spring Boot Application");
		if (args.length > 0) {
			for (String arg : args) {
				System.out.println("Command line argument: " + arg);
			}
		}
	}

}
