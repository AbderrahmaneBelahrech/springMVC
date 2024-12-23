package net.abdo.patients_app;

import net.abdo.patients_app.entities.Patient;
import net.abdo.patients_app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringMvcApplication {
//	@Autowired
//	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(PatientRepository patientRepository) {
		return args -> {
			Patient p1 = new Patient();
			p1.setDateNaissance(new Date());
			p1.setMalade(false);
			p1.setScore(20);

			Patient p2 = new Patient(null, "yahya", "rami", new Date(), true, 10);
			Patient p3 = new Patient(null, "yahya", "rami", new Date(), true, 10);
			Patient p4 = new Patient(null, "yahya", "rami", new Date(), true, 10);
			Patient p5 = new Patient(null, "yahya", "rami", new Date(), true, 10);

//			Patient p3 = Patient.builder()
//					.nom("abdo3")
//					.build();

			patientRepository.save(p1);
			patientRepository.save(p2);
			patientRepository.save(p3);
			patientRepository.save(p4);
			patientRepository.save(p5);
//			patientRepository.save(p3);



			patientRepository.findAll().forEach(System.out::println);

//			List<Patient> patients = patientRepository.findAll();
//			patients.forEach(System.out::println);
//		};

		List<Patient> patients = patientRepository.findAll();
			patients.forEach(p -> {
				System.out.println(p);
			});
		};
	}
}
