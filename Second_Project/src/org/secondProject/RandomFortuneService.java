package org.secondProject;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of Strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        return data[myRandom.nextInt(data.length)];
    }
}
