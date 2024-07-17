package com.monad._case.views.personel;

import com.monad._case.DummyDataGenerator;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.ListDataProvider;

@PageTitle("Personel")


@Route("")
public class PersonelView extends VerticalLayout {

    private ListDataProvider<Personel> dataProvider;

    public PersonelView() {
        TextField searchField = new TextField("Personel Ara");
        searchField.setPlaceholder("Adı girin...");
        searchField.addValueChangeListener(event -> {
            String filterText = event.getValue().toLowerCase();
            dataProvider.setFilter(personel ->
                    personel.getAd().toLowerCase().contains(filterText));
        });

        Grid<Personel> grid = new Grid<>();
        grid.addColumn(Personel::getAd).setHeader("Ad");
        grid.addColumn(Personel::getSoyad).setHeader("Soyad");

        List<Personel> personelList = DummyDataGenerator.generateDummyData();
        dataProvider = new ListDataProvider<>(personelList);
        grid.setDataProvider(dataProvider);

        add(searchField, grid);
    }
}