package org;

public class ClimbingCoach implements Coach{


    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    // create a no-arg constructor
    public ClimbingCoach() {
        System.out.println("CricketCoach: inside no-arg constructor.");
    }

    // our setter methods
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method. - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method. - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method. - setTeam");
        this.team = team;
    }

    // our getter methods
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }



    @Override
    public String getDailyWorkout() {
        return "Campus training for 40 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
