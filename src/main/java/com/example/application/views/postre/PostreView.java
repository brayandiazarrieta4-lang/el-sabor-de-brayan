package com.example.application.views.postre; 



import com.vaadin.flow.component.html.Image;
import com.example.application.model.Receta;
import com.example.application.service.RecetaService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Menu;

import java.util.List;

@PageTitle("Recetas de 🍰 Postres")
@Route("postre")
@Menu(order = 2, icon = LineAwesomeIconUrl.FILE)
public class PostreView extends VerticalLayout {

    public PostreView() {

        // CONFIGURACIÓN
        setPadding(true);
        setSpacing(true);

        




        // SERVICE
        RecetaService service = new RecetaService();
        List<Receta> recetas = service.obtenerPorCategoria("Carne");

        // CONTENEDOR PRINCIPAL
        VerticalLayout contenedor = new VerticalLayout();

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

        // BOTON VOLVER
        Button volver = new Button("Volver", e -> {
            getUI().ifPresent(ui -> ui.navigate(""));
        });

        add(contenedor, volver);
    }

    // MÉTODO PARA CREAR TARJETAS
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
        String ingredientesTexto = String.join(", ", r.getIngredientes());
        Span ingredientes = new Span("🧂 Ingredientes: " + ingredientesTexto);
        String implementosTexto = String.join(", ", r.getImplementos());
        Span implementos = new Span("🔧 Implementos: " + implementosTexto);
        Span detalles = new Span("📄 Detalles: " + r.getDetalles());
        Span tips = new Span("💡 Tips: " + r.getTips());

        Button ver = new Button("Ver receta");

        VerticalLayout contenido = new VerticalLayout(img, nombre, origen, tiempo, ingredientes, implementos, detalles, tips, ver);
        contenido.setSpacing(false);

        card.add(contenido);

        return card;
    }
}
