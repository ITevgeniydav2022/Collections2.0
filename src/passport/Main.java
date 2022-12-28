package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Задание 6
        System.out.println("Задание 6");

        Set<Passport> passports = new HashSet<>();
                        passports.add(new Passport("234765",
                                "Andrey",
                                "Jhonov",
                                "Petrovich",
                                LocalDate.now().minusYears(35)));
                        passports.add(new Passport("214756",
                                 "Sergey",
                                 "Prdrov",
                                 "Ignatovich",
                                 LocalDate.now().minusYears(16)));

        PassportList passportList = new PassportList(passports);

        System.out.println(passportList);

                        passportList.add(new Passport("235765",
                                 "Anton",
                                 "Gafarov",
                                 "Sergeevich",
                                 LocalDate.now().minusYears(21)));
        System.out.println(passportList);


    }
}
