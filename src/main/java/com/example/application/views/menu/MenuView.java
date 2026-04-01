package com.example.application.views.menu;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Menu;

@PageTitle("Menu")
@Route("")
@Menu(order = 1, icon = LineAwesomeIconUrl.FILE)
public class MenuView extends VerticalLayout {

    public MenuView() {

        // CONFIGURACIÓN DE LA VISTA
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        // TITULO
        H1 titulo = new H1("🍽️ Selecciona tu tipo de receta");

        // COMBOBOX
        ComboBox<String> categorias = new ComboBox<>("Categoría");
        categorias.setItems("Carne", "Postre", "Vegetariana");
        categorias.setPlaceholder("Elige una opción");

        // BOTÓN CONTINUAR
        Button continuar = new Button("Continuar", e -> {

            String seleccion = categorias.getValue();

            // VALIDACIÓN
            if (seleccion == null) {
                Notification.show("Por favor selecciona una categoría");
                return;
            }

            // NAVEGACIÓN
            switch (seleccion) {
                case "Carne":
                    getUI().ifPresent(ui -> ui.navigate("carne"));
                    break;

                case "Postre":
                    getUI().ifPresent(ui -> ui.navigate("postre"));
                    break;

                case "Vegetariana":
                    getUI().ifPresent(ui -> ui.navigate("vegetariana"));
                    break;
            }
        });

        // AGREGAR COMPONENTES
        add(titulo, categorias, continuar);
    }
}