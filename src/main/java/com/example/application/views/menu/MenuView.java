package com.example.application.views.menu;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.*;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Menu;


@PageTitle("Menu")
@Route("")
@Menu(order = 1, icon = LineAwesomeIconUrl.AWARD_SOLID)
public class MenuView extends VerticalLayout {

    public MenuView() {

        // CONFIGURACION GENERAL
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        // FONDO
        getStyle().set("background",
                "linear-gradient(135deg, #f5f5f5, #e0e0e0)");

        // CONTENEDOR PRINCIPAL (sin card)
        VerticalLayout contenido = new VerticalLayout();
        contenido.setAlignItems(Alignment.CENTER);
        contenido.setSpacing(true);
        contenido.setPadding(false);

        //TITULO
        H1 titulo = new H1("BIENVENIDO");
        titulo.getStyle()
                .set("margin", "0")
                .set("font-size", "40px")
                .set("letter-spacing", "2px");

        // IMAGEN
       Image imagen = new Image("images/El_sabor.jpeg", "menu");
        imagen.setWidth("325px");
        imagen.setHeight("325px");

        imagen.getStyle()
                .set("border-radius", "50%")
                .set("object-fit", "cover")
                .set("box-shadow", "0 10px 25px rgba(0,0,0,0.2)");

        // DESCRIPCION
               Paragraph descripcion = new Paragraph(
                "Explora recetas organizadas por categoría y accede a cada preparación de forma rápida, visual y sencilla."
        );
        descripcion.getStyle()
                .set("max-width", "760px")
                .set("text-align", "center")
                .set("color", "#4b5563")
                .set("font-size", "1.05rem")
                .set("margin", "0");

        //SUBTITULO
        H3 subtitulo = new H3("🍽️ Selecciona tu tipo de receta");
        subtitulo.getStyle()
                .set("margin", "10px 0")
                .set("color", "#444");

        //COMBOBOX
        ComboBox<String> categorias = new ComboBox<>("Categoría");
        categorias.setItems("Carne", "Postre", "Vegetariana");
        categorias.setPlaceholder("Elige una opción");
        categorias.setWidth("280px");

        // 🔘 BOTÓN
        Button continuar = new Button("Continuar", e -> {

            String seleccion = categorias.getValue();

            if (seleccion == null) {
                Notification.show("Por favor selecciona una categoría");
                return;
            }

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

        continuar.setWidth("280px");
        continuar.getStyle()
                .set("background-color", "#ff7a00")
                .set("color", "white")
                .set("border-radius", "12px")
                .set("font-weight", "bold")
                .set("padding", "10px");

        // AGRUPAR INPUT + BOTÓN
        VerticalLayout acciones = new VerticalLayout(categorias, continuar);
        acciones.setAlignItems(Alignment.CENTER);
        acciones.setSpacing(true);

        // AGREGAR TODO
        contenido.add(titulo, imagen, descripcion, subtitulo, acciones);

        add(contenido);
    }
}