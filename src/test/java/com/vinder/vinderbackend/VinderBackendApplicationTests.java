package com.vinder.vinderbackend;

import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.MatchRepository;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class VinderBackendApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MatchRepository matchRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void checkMatches() {

        User mark = new User("Mark", 33, Gender.Male, "Glasgow", Gender.Female, "Programming", true);
        userRepository.save(mark);

        User david = new User("David", 24, Gender.Male, "Glasgow", Gender.Female, "Programming", true);
        userRepository.save(david);

        User natalie = new User("Natalie", 30, Gender.Female, "Glasgow", Gender.Male, "Programming", true);
        userRepository.save(natalie);

        User harrison = new User("Harrison", 23, Gender.Male, "Alderran", Gender.Female, "Killing bad guys", true);
        userRepository.save(harrison);

        User bill = new User("Bill", 50, Gender.Male, "Glasgow", Gender.Female, "Swimming", true);
        userRepository.save(bill);

        User mike = new User("Mike", 45, Gender.Male, "Edinburgh", Gender.Female, "Cycling", true);
        userRepository.save(mike);

        User doug = new User("Doug", 25, Gender.Male, "Inverness", Gender.Female, "Running", true);
        userRepository.save(doug);

        User barry = new User("Barry", 20, Gender.Male, "Inverness", Gender.Female, "Running", true);
        userRepository.save(barry);

        User james = new User("James", 18, Gender.Male, "Inverness", Gender.Female, "Running", true);
        userRepository.save(james);

        Match match1 = new Match(james, barry);
        matchRepository.save(match1);

        Match match2 = new Match(james, doug);
        matchRepository.save(match2);

//        System.out.println(james.getId());

//        List<User> users = userRepository.matchedUsersForSpecificUser(james.getId());

//        System.out.println(userRepository.matchedUsersForSpecificUser(doug.getId()));
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getName());
//        }


        Optional<User> user = userRepository.findById(8L);

//        List<Match> matches = user.get().getMatches();
//        matches.addAll(user.get().getMatchedWiths());

//        System.out.println(user.get().getMatchedWiths().get(0).getMatchedUser().getName());

//        for (int i=0;i<user.get().getMatchedWiths().size();i++) {
//            matches.add(user.get().getMatchedWiths().get(i));
//        }

//        for (int i=0;i<matches.size();i++) {
//            System.out.println(matches.get(i).getUser().getName());
//        }

//        System.out.println(user.get().getMatches().get(0).getUser().getName());

        List<Match> matches = new ArrayList<>();


        for (int i=0;i<user.get().getMatches().size();i++){
            matches.add(user.get().getMatches().get(i));
//            System.out.println(user.get().getMatches().get(i).getClass());
        }

        for (int i=0;i<user.get().getMatchedWiths().size();i++){
            matches.add(user.get().getMatchedWiths().get(i));
            System.out.println(matches.get(i+user.get().getMatches().size()).getMatchedUser().getName());
        }



    }

}
