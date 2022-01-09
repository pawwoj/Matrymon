package model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@RequiredArgsConstructor
public class Programmer {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private int salary;
    @NonNull
    private List<Language> languageList = new ArrayList<>();

    private List<Woman> womanList = new ArrayList<>();

    public Programmer(String firstName, String lastName, int salary, List<Language> languageList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.languageList = languageList;
    }

    @AllArgsConstructor
    public enum Language {
        J("Java"),
        C("C++"),
        JS("JavaScript"),
        P("Python"),
        S("SQL");

        String fullNameLanguage;
    }
}