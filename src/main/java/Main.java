import application.Application;

public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}
/*
         * Stworz krotki system do zarzadzania programistami i ich partnerkami
         *
         * Programista ma imie, nazwisko, pensje oraz lsite jezykow jakie zna
         *
         * Kobieta ma imie, nazwsiko, rozmiar biustu oraz IQ
         *
         * Napisz metode ktora znajduje top n programistow (jesli chodzi o zarobki)
         * ktorzy kodza w javie. Jesli nie jestes w stanie tego zrobic rzuc wyjatkiem
         * NoJavaPorgrammerHere
         *
         * Programista moze chodzic na Randke(nazwa, miejsce, kobieta). Napisz metode
         * ktora wylicza % szanse na zaliczenie na randce. Algorytm zalezy odm iejsca np
         * restuaracja +10%, kino +20% itd oraz od kobiety, rozmiar A + 10%, B+ 20% itd
         * oraz od IQ wzor IQ/100. Jesli szansa na zaliczenie wynosi over 100%
         * programista jest zapewny siebie i jego szanse spdaja, zatem obslugujemy
         * wyajtek i ustawiamy szanse na zaliczenie do 30%
         *
         * Dodaj kobiecie atrybut ulubione miejsce, ktore jest losowane z listy miejsc.
         Jesli wylosowane ulubione miejsce kobiety jest inne niz to w ktorym zabral je
         programista powstaje konflikt, BadPlaceForDateException z zastrzezeniem ze
         moze przyjac on wiadomosc dla programisty od kobiety albo zostac pusty
         *
         * + Mozesz stworzyc hierarchie Kobieta -> Partnerka, Zona, Kochanka
         * + JezykiProgramowania niech beda enumem, Miejsce na randke rowniez enum
         */