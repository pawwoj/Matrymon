package application;

import model.*;
import service.DateToScoreService;
import service.ProgrammerService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public void run() {
        // Profesjonalne testy
       /* Woman woman1x = new Woman("Majka", "Bajka", 100, Woman.BoobsSize.A, Place.drawPlace());
        DateToScoreService dateToScoreService = new DateToScoreService();
        DateToScore dateToScore = new DateToScore("test",Place.RESTAURANT, woman1x);
        System.out.println(woman1x);
        System.out.println(woman1x.getScoreChanceByIq());
        System.out.println(dateToScoreService.chanceToScoreOnDate(dateToScore));

        List<Programmer> programmerList = new ArrayList<>();
        List<Programmer.Language> languageListWithJava = List.of(Programmer.Language.J, Programmer.Language.C);
        List<Programmer.Language> languageListWithoutJava = List.of(Programmer.Language.S, Programmer.Language.C);


        programmerList.add(new Programmer("Iza", "Piza", 25000, languageListWithJava));
        programmerList.add(new Programmer("Daria", "Walnia", 33000, languageListWithJava));
        programmerList.add(new Programmer("Franek", "Garbaty", 25000, languageListWithJava));
        programmerList.add(new Programmer("Jan", "Kowalski", 15000, languageListWithJava));
        programmerList.add(new Programmer("Adam", "Jankowski", 13000, languageListWithJava));
        programmerList.add(new Programmer("Monika", "Dupna", 11000, languageListWithoutJava));
        programmerList.add(new Programmer("Anna", "Cycata", 5000, languageListWithoutJava));

        System.out.println(programmerList);
        ProgrammerService programmerService = new ProgrammerService();

        System.out.println(programmerService.topProgrammersByLanguage(2,programmerList, Programmer.Language.J));

        Woman woman1 = new Woman("Majka", "Ene", 120, Woman.BoobsSize.C, Place.drawPlace());
        Wife woman2 = new Wife("Ania", "Due", 102, Woman.BoobsSize.A, Place.drawPlace());
        Lover woman3 = new Lover("Frania", "Rabe", 97, Woman.BoobsSize.F, Place.drawPlace());
        Partner woman4 = new Partner("Hania", "Żabe", 87, Woman.BoobsSize.E, Place.drawPlace());
        List<Woman> womanList = List.of(woman1,woman2,woman3,woman4);

        Programmer programmer1
                = new Programmer("Edek", "Kredek", 50000, languageListWithJava, womanList);
        System.out.println(programmer1);

        System.out.println(programmer1.getWomanList().toString());*/
    }
}
