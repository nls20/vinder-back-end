package com.vinder.vinderbackend.components;

import com.vinder.vinderbackend.models.conversation.Conversation;
import com.vinder.vinderbackend.models.conversation.Message;
import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.matches.MessageItem;
import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    MessageItemRepository messageItemRepository;

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


        User mary = new User("Mary", 45, Gender.MALE, "Edinburgh", Gender.FEMALE, "Cycling", true);
        userRepository.save(mary);


        User amy = new User("Amy", 20, Gender.MALE, "Inverness", Gender.FEMALE, "Running", true);
        userRepository.save(amy);

        User james = new User("James", 18, Gender.MALE, "Inverness", Gender.FEMALE, "Running", true);
        userRepository.save(james);

        User barry = new User("Barry", 50, Gender.MALE, "Glasgow", Gender.FEMALE, "Swimming", true);
        userRepository.save(barry);

        ProfileImage picture1 = new ProfileImage("https://static.standard.co.uk/s3fs-public/thumbnails/image/2019/09/09/11/markzuckerberg.jpg?width=1200", mark);
        profileImageRepository.save(picture1);

        ProfileImage picture2 = new ProfileImage("https://i.pinimg.com/originals/4e/10/e5/4e10e564d614436de1fc60cb45198cc4.jpg", david);
        profileImageRepository.save(picture2);

        ProfileImage picture3 = new ProfileImage("https://wwd.com/wp-content/uploads/2021/02/Natalie-Mariduena-Sports-Illustrated-Swimsuit-by-James-Macari-Image.jpg?crop=0px%2C0px%2C4000px%2C2671px&resize=640%2C415", natalie);
        profileImageRepository.save(picture3);

        ProfileImage picture4 = new ProfileImage("https://pbs.twimg.com/profile_images/988775660163252226/XpgonN0X_400x400.jpg", barry);
        profileImageRepository.save(picture4);

        ProfileImage picture5 = new ProfileImage("https://nmwa.org/wp-content/uploads/2020/01/Cassatt-Mary.jpg", mary);
        profileImageRepository.save(picture5);


        ProfileImage picture6 = new ProfileImage("https://dazedimg-dazedgroup.netdna-ssl.com/1600/azure/dazed-prod/1260/6/1266650.jpg", amy);
        profileImageRepository.save(picture6);

        ProfileImage picture7 = new ProfileImage("https://cdn.vox-cdn.com/thumbor/lJCqhjRPikekq4a9mWVWPQJb3qU=/0x0:844x433/1200x800/filters:focal(378x168:512x302)/cdn.vox-cdn.com/uploads/chorus_image/image/63840187/Screen_Shot_2019_05_15_at_12.58.00_PM.0.png", james);
        profileImageRepository.save(picture7);




        //MATCHES

        Match match1 = new Match(barry, david);
        matchRepository.save(match1);

        Match match2 = new Match(barry, amy);
        matchRepository.save(match2);

        Match match3 = new Match(barry, natalie);
        matchRepository.save(match3);

        MessageItem messageMatch1 = new MessageItem(barry, match1, "Do you like raisins");
        messageItemRepository.save(messageMatch1);

        MessageItem messageMatch2 = new MessageItem(barry, match1, "no....how about a date?");
        messageItemRepository.save(messageMatch2);

        List<MessageItem> items = new ArrayList<>();
        items.add(messageMatch1);
        items.add(messageMatch2);
        match1.setMessages(items);


        MessageItem messageMatch3 = new MessageItem(barry, match2, "Hey, how are you doing? ");
        messageItemRepository.save(messageMatch3);

        MessageItem messageMatch4 = new MessageItem(amy, match2, "Yeah, good. Just out having a party");
        messageItemRepository.save(messageMatch4);

        MessageItem messageMatch5 = new MessageItem(barry, match2, "sounds like you are having a good time, can i come?");
        messageItemRepository.save(messageMatch5);

        MessageItem messageMatch6 = new MessageItem(amy, match2, "emm.....Might be a bit wild for you tastes");
        messageItemRepository.save(messageMatch6);

        MessageItem messageMatch7 = new MessageItem(barry, match2, "Do you even know how i am? I am a party animal");
        messageItemRepository.save(messageMatch7);

        MessageItem messageMatch8 = new MessageItem(amy, match2, "........, come on then.");
        messageItemRepository.save(messageMatch8);


        List<MessageItem> items1 = new ArrayList<>();
        items1.add(messageMatch3);
        items1.add(messageMatch4);
        items1.add(messageMatch5);
        items1.add(messageMatch6);
        items1.add(messageMatch7);
        items1.add(messageMatch8);
        match2.setMessages(items1);


        MessageItem messageMatch9 = new MessageItem(barry, match3, "Oh my god, did it hurt?");
        messageItemRepository.save(messageMatch9);

        MessageItem messageMatch10 = new MessageItem(natalie, match3, "what?");
        messageItemRepository.save(messageMatch10);

        MessageItem messageMatch11 = new MessageItem(barry, match3, "When you fell down from heaven");
        messageItemRepository.save(messageMatch11);

        MessageItem messageMatch12 = new MessageItem(natalie, match3, "........, Smooth moves.");
        messageItemRepository.save(messageMatch12);

        List<MessageItem> items2 = new ArrayList<>();
        items2.add(messageMatch9);
        items2.add(messageMatch10);
        items2.add(messageMatch11);
        items2.add(messageMatch12);
        match3.setMessages(items2);

    }

}
