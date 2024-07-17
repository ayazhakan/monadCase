package com.monad._case;

import com.monad._case.views.personel.Personel;

import java.util.ArrayList;
import java.util.List;

public class DummyDataGenerator {
    public static List<Personel> generateDummyData() {
        List<Personel> personelList = new ArrayList<>();
        // Dummy data ekleyelim
        for (int i = 1; i <= 10; i++) {
            Personel personel = new Personel("TC" + i, "Ad" + i, "Soyad" + i);
            personelList.add(personel);
        }
        return personelList;
    }
}
