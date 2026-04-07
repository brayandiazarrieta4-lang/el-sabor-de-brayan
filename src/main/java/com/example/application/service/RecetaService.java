package com.example.application.service;

import com.example.application.model.*;

import java.util.ArrayList;
import java.util.List;

public class RecetaService {

    private List<Receta> recetas;

    // CONSTRUCTOR
    public RecetaService() {
        recetas = new ArrayList<>();
        cargarDatos();
    }

    // CARGAR DATOS 
    private void cargarDatos() {

        // CARNE

        //RECETA DE CARNE 1
        Receta carne1 = new RecetaCarne(1, "Carne Asada", "Colombia", 60);
        carne1.setImagen("images/Carne1.png");
        carne1.agregarIngrediente("Carne, 500g. Sal, 2 cucharaditas. Ajo, 3 dientes. Pimienta, al gusto. Aceite de oliva, 2 cucharadas.");
        carne1.agregarImplemento("Parrilla");
        carne1.setDetalles("Cocinar a fuego medio durante 60 minutos");
        carne1.setTips("Dejar reposar la carne antes de servir");
        //RECETA DE CARNE 2
        Receta carne2 = new RecetaCarne(2, "Tacos al Pastor", "México", 50);
        carne2.setImagen("images/Carne2.png");
        carne2.agregarIngrediente("Carne de cerdo, piña, cebolla, ajo, chile guajillo, especias, sal y aceite..");
        carne2.agregarImplemento("Parrilla o sartén");
        carne2.setDetalles("Marinar la carne mínimo 4 horas y cocinar a fuego medio.");
        carne2.setTips("Servir con tortillas, cebolla, cilantro y salsa al gusto.");
        //RECETA DE CARNE 3
        Receta carne3 = new RecetaCarne(3, "Philly Cheesesteak", "Estados Unidos", 10);
        carne3.setImagen("images/Carne3.png");
        carne3.agregarIngrediente("Carne de res, cebolla, pimiento, champiñones, queso, pan, sal, pimienta y aceite..");
        carne3.agregarImplemento("Sartén");
        carne3.setDetalles("Cocinar la carne en tiras, añadir verduras, derretir el queso y servir en pan.");
        carne3.setTips("Agregar salsa al gusto para más sabor.");
        //RECETA DE CARNE 4
        Receta carne4 = new RecetaCarne(4, "Bandeja Paisa", "Colombia", 20);
        carne4.setImagen("images/Carne4.png");
        carne4.agregarIngrediente("Carne de res, arroz, frijoles, plátano, aguacate, cebolla, ajo, sal y aceite.");
        carne4.agregarImplemento("Sartén y olla");
        carne4.setDetalles("Cocinar carne, arroz y frijoles; freír plátano y servir todo con aguacate.");
        carne4.setTips("Es un plato muy completo, ideal para compartir en familia");
        //RECETA DE CARNE 5
        Receta carne5 = new RecetaCarne(5, "Ropa Vieja", "Cuba", 20);
        carne5.setImagen("images/Carne5.png");
        carne5.agregarIngrediente("Carne de res, cebolla, pimiento, tomate, ajo, especias, sal, pimienta y aceite.");
        carne5.agregarImplemento("Sartén y olla");
        carne5.setDetalles("Cocer, desmenuzar la carne y cocinar con verduras y especias, agregando caldo si es necesario.");
        carne5.setTips("Servir con arroz blanco y plátanos fritos para una experiencia auténtica");
        //RECETA DE CARNE 6
        Receta carne6 = new RecetaCarne(6, "Carne en Bistec", "Colombia", 15);
        carne6.setImagen("images/Carne6.png");
        carne6.agregarIngrediente("Carne de res, cebolla, ajo, sal, pimienta y aceite.");
        carne6.agregarImplemento("Sartén");
        carne6.setDetalles("Cortar la carne en bistecs y sazonar con sal, pimienta, ajo picado y un poco de aceite. Cocinar en el sartén a fuego medio durante 5-7 minutos por cada lado, dependiendo del grosor del bistec y del punto de cocción deseado.");
        carne6.setTips("Acompañar con papas fritas o una ensalada fresca para una comida completa");

        // POSTRE

        //RECETA DE POSTRE1
        Receta postre1 = new RecetaPostre(7, "Tarta Sacher", "Austria", 45);
        postre1.setImagen("images/postre1.png");
        postre1.agregarIngrediente("Chocolate, mantequilla, azúcar, huevos, harina y mermelada..");
        postre1.agregarImplemento("Horno");
        postre1.setDetalles("Mezclar ingredientes, hornear y rellenar con mermelada.");
        postre1.setTips("No abrir el horno al inicio y dejar enfriar antes de cortar.");
        //RECETA DE POSTRE2
        Receta postre2 = new RecetaPostre(8, "Tiramisú", "Italia", 45);
        postre2.setImagen("images/postre2.png");
        postre2.agregarIngrediente("Mascarpone, huevos, azúcar, café, bizcochos y cacao..");
        postre2.agregarImplemento("Refrigerador");
        postre2.setDetalles("Mezclar yemas con azúcar y mascarpone, añadir claras batidas, armar capas con bizcochos en café y refrigerar..");
        postre2.setTips("Agregar licor para más sabor y refrigerar bien para mejor textura..");
        //RECETA DE POSTRE3
        Receta postre3 = new RecetaPostre(9, "Prinzregententorte", "Alemania", 45);
        postre3.setImagen("images/postre3.png");
        postre3.agregarIngrediente("Chocolate, mantequilla, azúcar, huevos, harina y mermelada.");
        postre3.agregarImplemento("Horno");
        postre3.setDetalles("Hornear capas de bizcocho, rellenar con mermelada y cubrir con ganache de chocolate.");
        postre3.setTips("Dejar enfriar completamente antes de cortar para obtener mejores resultados y decorar con chocolate rallado para un toque extra de sabor.");
        //RECETA DE POSTRE4
        Receta postre4 = new RecetaPostre(10, "Daikufu Mochi", "Japón", 45);
        postre4.setImagen("images/postre4.png");
        postre4.agregarIngrediente("Harina de arroz, azúcar, agua y relleno dulce..");
        postre4.agregarImplemento("Horno");
        postre4.setDetalles("Hacer masa, cocinar al vapor, rellenar y formar bolas de mochi.");
        postre4.setTips("Cocinar bien para textura pegajosa y usar harina para evitar que se pegue y disfrutar de su sabor único y textura suave.");
       
        //RECETA DE POSTRE5
        Receta postre5 = new RecetaPostre(11, "Cheescake", "Estados Unidos", 45);
        postre5.setImagen("images/postre5.png");
        postre5.agregarIngrediente("Queso crema, azúcar, huevos, galletas y mantequilla..");
        postre5.agregarImplemento("Horno");
        postre5.setDetalles("Mezclar queso crema con azúcar y huevos, hacer base con galletas y mantequilla, hornear y refrigerar.");
        postre5.setTips("Refrigerar al menos 4 horas para mejor textura y decorar con frutas frescas o salsa de chocolate para un toque extra de sabor.");
        //RECETA DE POSTRE6
        Receta postre6 = new RecetaPostre(12, "Baklavas ", "Turquía", 45);
        postre6.setImagen("images/postre6.png");
        postre6.agregarIngrediente("Masa filo, nueces, azúcar, mantequilla y jarabe de miel..");
        postre6.agregarImplemento("Horno");
        postre6.setDetalles("Colocar capas de masa filo con mantequilla, añadir mezcla de nueces y azúcar, hornear y bañar con jarabe de miel.");
        postre6.setTips("Dejar reposar el baklava después de hornear para que absorba el jarabe y obtener una textura más jugosa y deliciosa y cortar en porciones pequeñas para disfrutar de su intenso sabor y textura crujiente.");

        // VEGETARIANA

        //RECETA VEGETARIANA1
        Receta veg1 = new RecetaVegetariana(13, "Som Tam ", "Tailandia", 15);
        veg1.setImagen("images/vegetariano1.png");
        veg1.agregarIngrediente("Papaya verde, zanahoria, tomate, judías verdes, cacahuetes, ajo, chile, salsa de pescado y limón..");
        veg1.agregarImplemento("Mortero o procesador de alimentos");
        veg1.setDetalles("Machacar ajo y chile, añadir papaya y zanahoria rallada, tomate y judías verdes picadas, mezclar con salsa de pescado y limón, y espolvorear con cacahuetes.");
        veg1.setTips("Ajustar el nivel de picante al gusto y servir como acompañamiento o plato principal para disfrutar de su sabor fresco y picante.");

        //RECETA VEGETARIANA2
        Receta veg2 = new RecetaVegetariana(14, "Biryani de Verduras ", "India", 15);
        veg2.setImagen("images/vegetariano2.png");
        veg2.agregarIngrediente("Arroz basmati, verduras mixtas (zanahoria, guisantes, patata), cebolla, ajo, jengibre, especias (comino, cardamomo, canela), yogur y cilantro..");
        veg2.agregarImplemento("Olla o sartén grande");
        veg2.setDetalles("Sofreír cebolla, ajo y jengibre, añadir especias, verduras y arroz, mezclar con yogur, cocinar a fuego lento hasta que el arroz esté tierno y decorar con cilantro fresco antes de servir para disfrutar de su sabor aromático y delicioso.");
        veg2.setTips("Agregar limón al final");

        //RECETA VEGETARIANA3
        Receta veg3 = new RecetaVegetariana(15, "Doenjang Jjigae", "Corea", 15);
        veg3.setImagen("images/vegetariano3.png");
        veg3.agregarIngrediente("Pasta de soja fermentada (doenjang), tofu, cebolla, ajo, calabacín, champiñones, caldo de verduras y guindilla..");
        veg3.agregarImplemento("Olla");
        veg3.setDetalles("Sofreír ajo y cebolla, añadir pasta de soja, caldo y verduras, cocinar a fuego medio hasta que las verduras estén tiernas y el tofu caliente, y ajustar el sabor con guindilla al gusto para disfrutar de su sabor umami y reconfortante.");
        veg3.setTips("Agregar guindilla al gusto para ajustar el nivel de picante y servir con arroz blanco para una comida completa y satisfactoria.");
        //RECETA VEGETARIANA4

        Receta veg4 = new RecetaVegetariana(16, "Rollitos de primavera", "China", 15);
        veg4.setImagen("images/vegetariano4.png");
        veg4.agregarIngrediente("Hojas de arroz, verduras mixtas (repollo, zanahoria, brotes de soja), fideos de arroz, salsa de soja, jengibre y ajo..");
        veg4.agregarImplemento("Sartén o freidora");
        veg4.setDetalles("Hidratar hojas de arroz, mezclar verduras ralladas y fideos cocidos con salsa de soja, jengibre y ajo, rellenar las hojas de arroz con la mezcla, enrollar y freír hasta que estén dorados y crujientes para disfrutar de su sabor fresco y textura crujiente.");
        veg4.setTips("Servir con salsa agridulce o de cacahuete para un toque extra de sabor y disfrutar como aperitivo o plato principal ligero.");

        //RECETA VEGETARIANA5
        Receta veg5 = new RecetaVegetariana(17, "Melanzane alla Parmigiana", "Italia", 15);
        veg5.setImagen("images/vegetariano5.png");
        veg5.agregarIngrediente("Berenjena, salsa de tomate, queso parmesano, mozzarella, albahaca, ajo, sal y aceite..");
        veg5.agregarImplemento("Horno o sartén");
        veg5.setDetalles("Cortar berenjena en rodajas, salarlas y dejarlas reposar para eliminar el exceso de agua, luego freírlas o asarlas. En una fuente para horno, colocar capas de berenjena, salsa de tomate, queso parmesano rallado, mozzarella y albahaca picada. Repetir las capas y terminar con queso. Hornear hasta que el queso esté dorado y burbujeante para disfrutar de su sabor rico y reconfortante.");
        veg5.setTips("Dejar reposar el plato después de hornear para que los sabores se mezclen mejor y servir con una ensalada fresca para equilibrar la riqueza del plato.");

        //RECETA VEGETARIANA6
        Receta veg6 = new RecetaVegetariana(18, "Gazpacho", "España", 15);
        veg6.setImagen("images/vegetariano6.png");
        veg6.agregarIngrediente("Tomate, pepino, pimiento, cebolla, ajo, aceite de oliva, vinagre, sal y agua..");
        veg6.agregarImplemento("Licuadora o procesador de alimentos");
        veg6.setDetalles("Licuar todos los ingredientes hasta obtener una mezcla suave y cremosa, ajustar el sabor con sal y vinagre al gusto, y servir frío para disfrutar de su sabor refrescante y saludable.");
        veg6.setTips("Servir con pan crujiente o galletas para una comida completa y satisfactoria.");

        // FITNESS
        //RECETA FITNESS1
        Receta fitness1 = new RecetaFitness(19, "Salmón con arroz y ensalada de mango", "N/A", 15);
        fitness1.setImagen("images/fitt1.png");
        fitness1.agregarIngrediente("Salmón, arroz integral, mango, lechuga, limón, aceite, sal y pimienta.");
        fitness1.agregarImplemento("Sartén y olla");
        fitness1.setDetalles("Cocinar arroz y salmón, preparar ensalada de mango y servir juntos..");
        fitness1.setTips("Ajustar el nivel de aderezo en la ensalada según tu preferencia y agregar semillas de chía o nueces para un toque extra de textura y nutrientes.");
        //RECETA FITNESS2
        Receta fitness2 = new RecetaFitness(20, "Salteado de pollo con verduras", "N/A", 15);
        fitness2.setImagen("images/fitt2.png");
        fitness2.agregarIngrediente("Pechuga de pollo, zucchini, pimiento, cebolla, ajo, aceite de oliva, sal y pimienta.");
        fitness2.agregarImplemento("Sartén");
        fitness2.setDetalles("Cocinar la pechuga de pollo en una sartén a fuego medio hasta que esté cocida por completo. En la misma sartén, saltear las verduras hasta que estén tiernas y ligeramente doradas. Sazonar con sal y pimienta al gusto y servir caliente.");
        fitness2.setTips("Ajustar el nivel de sazón según tu preferencia y agregar hierbas frescas como cilantro o perejil para un toque extra de sabor.");
        //RECETA FITNESS3
        Receta fitness3 = new RecetaFitness(21, "Pechuga de pollo con puré de arvejas", "N/A", 15);
        fitness3.setImagen("images/fitt3.png");
        fitness3.agregarIngrediente("Pechuga de pollo, arvejas, cebolla, ajo, aceite de oliva, sal y pimienta.");
        fitness3.agregarImplemento("Sartén y olla");
        fitness3.setDetalles("Cocinar la pechuga de pollo en una sartén a fuego medio hasta que esté cocida por completo. En la misma sartén, saltear las arvejas y las verduras hasta que estén tiernas y ligeramente doradas. Sazonar con sal y pimienta al gusto y servir caliente.");
        fitness3.setTips("Ajustar el nivel de sazón según tu preferencia y agregar hierbas frescas como cilantro o perejil para un toque extra de sabor.");
        //RECETA FITNESS4
        Receta fitness4 = new RecetaFitness(22, "Lubina al horno con espárragos", "N/A", 15);
        fitness4.setImagen("images/fitt4.png");
        fitness4.agregarIngrediente("Lubina, espárragos, limón, ajo, aceite de oliva, sal y pimienta.");
        fitness4.agregarImplemento("Horno y plato");
        fitness4.setDetalles("Precalentar el horno a 180°C. Colocar la lubina y los espárragos en un plato, rociar con jugo de limón y sazonar con ajo, aceite de oliva, sal y pimienta. Hornear durante 15-20 minutos o hasta que la lubina esté cocida por completo.");
        fitness4.setTips("Ajustar el tiempo de horneado según el grosor de la lubina y agregar hierbas frescas como romero o tomillo para un toque extra de sabor.");
        //RECETA FITNESS5
        Receta fitness5 = new RecetaFitness(23, "Bagel de aguacate con atún", "N/A", 15);
        fitness5.setImagen("images/fitt5.png");
        fitness5.agregarIngrediente("Bagel, aguacate, atún, cebolla, limón, sal y pimienta al gusto.");
        fitness5.agregarImplemento("Cuchillo");
        fitness5.setDetalles("Mezclar todos los ingredientes y servir en el bagel para disfrutar de un desayuno o almuerzo rápido, saludable y delicioso.");
        fitness5.setTips("Agregar limón al final y ajustar el nivel de sazón según tu preferencia para obtener un sabor equilibrado y delicioso.");
        //RECETA FITNESS6
        Receta fitness6 = new RecetaFitness(24, "Crepes de espinacas rellenas de salmón y queso", "N/A", 15);
        fitness6.setImagen("images/fitt6.png");
        fitness6.agregarIngrediente("Espinacas, salmón, queso, cebolla, ajo, aceite de oliva, sal y pimienta.");
        fitness6.agregarImplemento("Sartén y plato");
        fitness6.setDetalles("Cocinar las espinacas en una sartén hasta que estén tiernas. Agregar el salmón y el queso, y cocinar hasta que el queso se derrita. Servir en crepes para disfrutar de un plato saludable y delicioso.");
        fitness6.setTips("Ajustar el nivel de sazón según tu preferencia y agregar hierbas frescas como cilantro o perejil para un toque extra de sabor.");

        //AÑADIR RECETAS A LA LISTA
        //CARNE
        recetas.add(carne1);
        recetas.add(carne2);
        recetas.add(carne3);
        recetas.add(carne4);
        recetas.add(carne5);
        recetas.add(carne6);
        //POSTRE
        recetas.add(postre1);
        recetas.add(postre2);
        recetas.add(postre3);
        recetas.add(postre4);
        recetas.add(postre5);
        recetas.add(postre6);
        //VEGETARIANO
        recetas.add(veg1);
        recetas.add(veg2);
        recetas.add(veg3);
        recetas.add(veg4);
        recetas.add(veg5);
        recetas.add(veg6);
        //FITNESS
        recetas.add(fitness1);
        recetas.add(fitness2);
        recetas.add(fitness3);
        recetas.add(fitness4);
        recetas.add(fitness5);
        recetas.add(fitness6);

    }

    // OBTENER TODAS LAS RECETAS
    public List<Receta> obtenerTodas() {
        return new ArrayList<>(recetas);
    }

    // FILTRAR POR CATEGORIA
    public List<Receta> obtenerPorCategoria(String categoria) {

        List<Receta> resultado = new ArrayList<>();

        for (Receta r : recetas) {
            if (r.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(r);
            }
        }

        return resultado;
    }

    // AGREGAR RECETA
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    // BUSCAR POR ID
    public Receta buscarPorId(int id) {

        for (Receta r : recetas) {
            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    // ELIMINAR RECETA
    public boolean eliminarReceta(int id) {
        return recetas.removeIf(r -> r.getId() == id);
    }

    // TOTAL DE RECETAS
    public int totalRecetas() {
        return recetas.size();
    }
}