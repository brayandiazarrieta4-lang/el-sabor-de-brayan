package com.example.application.views.fitness;

import com.example.application.model.Receta;
import com.example.application.service.RecetaService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

import java.util.List;

@PageTitle("💪 Recetas Fitness")
@Route("fitness")
@Menu(order = 4, icon = LineAwesomeIconUrl.DUMBBELL_SOLID)
public class FitnessView extends VerticalLayout {

    public FitnessView() {
        setPadding(true);
        setSpacing(true);

       

        RecetaService service = new RecetaService();
        List<Receta> recetas = service.obtenerPorCategoria("Fitness");

        VerticalLayout contenedor = new VerticalLayout();

        if (recetas.isEmpty()) {
            contenedor.add(new Span("Aun no hay recetas fitness registradas."));
        } else {
            HorizontalLayout fila = new HorizontalLayout();
            fila.setSpacing(true);
            int contador = 0;

            for (Receta r : recetas) {
                Div card = crearCard(r);
                fila.add(card);
                contador++;

                if (contador % 3 == 0) {
                    contenedor.add(fila);
                    fila = new HorizontalLayout();
                    fila.setSpacing(true);
                }
            }

            if (contador % 3 != 0) {
                contenedor.add(fila);
            }
        }

        Button volver = new Button("Volver", e -> getUI().ifPresent(ui -> ui.navigate("")));

        add(contenedor, volver);
    }

    private Div crearCard(Receta r) {
        Div card = new Div();
        card.getStyle()
                .set("border", "1px solid #ddd")
                .set("padding", "15px")
                .set("border-radius", "12px")
                .set("width", "350px")
                .set("background-color", "#f9f9f9")
                .set("box-shadow", "2px 2px 8px rgba(0,0,0,0.1)");

        Image img = new Image(r.getImagen(), r.getNombre());
        img.setWidth("100%");

        H3 nombre = new H3(r.getNombre());
        Span origen = new Span("🌍 Origen: " + r.getOrigen());
        Span tiempo = new Span("⏱ Tiempo: " + r.getTiempo() + " min");
        Span ingredientes = new Span("🧂 Ingredientes: " + String.join(", ", r.getIngredientes()));
        Span implementos = new Span("🔧 Implementos: " + String.join(", ", r.getImplementos()));
        Span detalles = new Span("📄 Detalles: " + r.getDetalles());
        Span tips = new Span("💡 Tips: " + r.getTips());

        Button ver = new Button("Ver receta");
        VerticalLayout contenido = new VerticalLayout(img, nombre, origen, tiempo, ingredientes, implementos, detalles, tips, ver);
        contenido.setSpacing(false);

        card.add(contenido);
        return card;
    }
}
