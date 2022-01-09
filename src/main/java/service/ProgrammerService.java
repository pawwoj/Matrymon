package service;

import exception.NoJavaProgrammerHere;
import model.Programmer;

import java.util.Comparator;
import java.util.List;

public class ProgrammerService {

    public List topProgrammersByLanguage(int count, List<Programmer> programmerList, Programmer.Language language) {
        List<Programmer> javaProgrammers = programmerList.stream()
                .filter(programmer -> programmer.getLanguageList()
                        .stream().anyMatch(language1 -> language1.equals(language)))
                .sorted(Comparator.comparingInt(Programmer::getSalary).reversed()).limit(count).toList();

        if (javaProgrammers.isEmpty())
            throw new NoJavaProgrammerHere("No Java programmer on list");

        return javaProgrammers;
    }
}