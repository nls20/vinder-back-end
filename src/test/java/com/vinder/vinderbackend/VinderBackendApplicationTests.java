package com.vinder.vinderbackend;

import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VinderBackendApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void checkMatches(){

		User mark = new User("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true);
		userRepository.save(mark);

		User david = new User("David", 24, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true);
		userRepository.save(david);

		User natalie = new User("Natalie", 30, Gender.FEMALE, "Glasgow", Gender.MALE, "Programming", true);
		userRepository.save(natalie);

		User harrison = new User("Harrison", 23, Gender.MALE, "Alderran", Gender.FEMALE, "Killing bad guys", true);
		userRepository.save(harrison);

		User bill = new User("Bill", 50, Gender.MALE, "Glasgow", Gender.FEMALE, "Swimming", true);
		userRepository.save(bill);

		User mike = new User("Mike", 45, Gender.MALE, "Edinburgh", Gender.FEMALE, "Cycling", true);
		userRepository.save(mike);

		User doug = new User("Doug", 25, Gender.MALE, "Inverness", Gender.FEMALE, "Running", true);
		userRepository.save(doug);

		User barry = new User("Barry", 20, Gender.MALE, "Inverness", Gender.FEMALE, "Running", true);
		userRepository.save(barry);

		User james = new User("James", 18, Gender.MALE, "Inverness", Gender.FEMALE, "Running", true);
		userRepository.save(james);



	}

}
