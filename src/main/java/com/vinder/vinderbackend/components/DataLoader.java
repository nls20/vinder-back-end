package com.vinder.vinderbackend.components;

import com.vinder.vinderbackend.models.conversation.Conversation;
import com.vinder.vinderbackend.models.conversation.Message;
import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProfileImageRepository profileImageRepository;

    @Autowired
    ConversationRepository conversationRepository;

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MatchRepository matchRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        //USERS

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


        ProfileImage picture1 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture1);

        ProfileImage picture2 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture2);

        ProfileImage picture3 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture3);



        //CONVERSATIONS
            //CONVERSATION_1

        Conversation conversation1 = new Conversation(mark);
        conversationRepository.save(conversation1);

        Participant participant1 = new Participant(conversation1, mark);
        participantRepository.save(participant1);

        Participant participant2 = new Participant(conversation1, natalie);
        participantRepository.save(participant2);

        Message message1 = new Message(participant1, "Hi Natalie (Chat 1)");
        messageRepository.save(message1);

        Message message2 = new Message(participant2, "Hi Mark (Chat 1)");
        messageRepository.save(message2);

        Message message3 = new Message(participant1, "This chat is boring (Chat 1)");
        messageRepository.save(message3);


            //CONVERSATION_2

        Conversation conversation2 = new Conversation(david);
        conversationRepository.save(conversation2);

        Participant participant3 = new Participant(conversation2, david);
        participantRepository.save(participant3);

        Participant participant4 = new Participant(conversation2, natalie);
        participantRepository.save(participant4);

        Message message4 = new Message(participant3, "Yo Natalie (Chat 2) ");
        messageRepository.save(message4);

        Message message5 = new Message(participant4, "Hi David (Chat 2)");
        messageRepository.save(message5);


        //MATCHES

        Match match1 = new Match(james, barry);
        matchRepository.save(match1);

        Match match2 = new Match(doug, james);
        matchRepository.save(match2);

    }

}
