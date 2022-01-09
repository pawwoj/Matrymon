package service;

import exception.NoJavaProgrammerHere;
import model.Programmer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ProgrammerServiceTest {

    @Test
    void topProgrammersByLanguage_returnedListHasSize3() {
        ProgrammerService programmerService = new ProgrammerService();
        List<Programmer.Language> languageListWithJava = List.of(Programmer.Language.J, Programmer.Language.C);
        List<Programmer.Language> languageListWithoutJava = List.of(Programmer.Language.S, Programmer.Language.C);
        Programmer prog1 = new Programmer("Iza", "Piza", 5000, languageListWithJava);
        Programmer prog2 = new Programmer("Franek", "Garbaty", 25000, languageListWithJava);
        Programmer prog3 = new Programmer("Jan", "Kowalski", 15000, languageListWithJava);
        Programmer prog4 = new Programmer("Adam", "Jankowski", 13000, languageListWithJava);
        Programmer prog5 = new Programmer("Monika", "Dupna", 11000, languageListWithoutJava);
        Programmer prog6 = new Programmer("Anna", "Cycata", 5000, languageListWithoutJava);
        Programmer prog7 = new Programmer("Edek", "Kredek", 50000, languageListWithJava);
        List<Programmer> programmerList
                = List.of(prog1, prog2, prog3, prog4, prog5, prog6, prog7);

        assertThat(programmerService.topProgrammersByLanguage(3, programmerList, Programmer.Language.J))
                .hasSize(3);
    }

    @Test
    void topProgrammersByLanguage_returnListOfProgrammersSortedBySalary() {
        ProgrammerService programmerService = new ProgrammerService();
        List<Programmer.Language> languageListWithJava = List.of(Programmer.Language.J, Programmer.Language.C);
        List<Programmer.Language> languageListWithoutJava = List.of(Programmer.Language.S, Programmer.Language.C);
        Programmer prog1 = new Programmer("Iza", "Piza", 5000, languageListWithJava);
        Programmer prog2 = new Programmer("Franek", "Garbaty", 25000, languageListWithJava);
        Programmer prog3 = new Programmer("Jan", "Kowalski", 15000, languageListWithJava);
        Programmer prog4 = new Programmer("Adam", "Jankowski", 13000, languageListWithJava);
        Programmer prog5 = new Programmer("Monika", "Dupna", 11000, languageListWithoutJava);
        Programmer prog6 = new Programmer("Anna", "Cycata", 5000, languageListWithoutJava);
        Programmer prog7 = new Programmer("Edek", "Kredek", 50000, languageListWithJava);
        List<Programmer> programmerList
                = List.of(prog1, prog2, prog3, prog4, prog5, prog6, prog7);
        List<Programmer> preparedSortedProgrammerList
                = List.of(prog7, prog2, prog3);

        assertThat(programmerService.topProgrammersByLanguage(3, programmerList, Programmer.Language.J))
                .isEqualTo(preparedSortedProgrammerList);
    }

    @Test
    void topProgrammersByLanguage_throwNoJavaProgrammerHereWhenGivenProgrammerListDonHaveAnyProgrammersWithJava() {
        ProgrammerService programmerService = new ProgrammerService();
        List<Programmer.Language> languageListWithoutJava = List.of(Programmer.Language.S, Programmer.Language.C);
        Programmer prog4 = new Programmer("Adam", "Jankowski", 13000, languageListWithoutJava);
        Programmer prog5 = new Programmer("Monika", "Dupna", 11000, languageListWithoutJava);
        Programmer prog6 = new Programmer("Anna", "Cycata", 5000, languageListWithoutJava);
        Programmer prog7 = new Programmer("Edek", "Kredek", 50000, languageListWithoutJava);
        List<Programmer> programmerList
                = List.of(prog4, prog5, prog6, prog7);

        assertThatThrownBy(() -> {
            programmerService.topProgrammersByLanguage(3, programmerList, Programmer.Language.J);
        }).isInstanceOf(NoJavaProgrammerHere.class)
                .hasMessageContaining("No Java programmer on list");
    }
}