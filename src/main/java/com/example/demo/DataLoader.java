package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        Product microondas1 = new Product();
        microondas1.setName("Microondas Infiniton MW-1015 ");
        microondas1.setDescription("MICROONDAS DE LIBRE INSTALACIóN");
        microondas1.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToOyx5jy8KmG_nita9xB0fMGrNbFXWuTAV3g&s");
        microondas1.setStock(2);
        microondas1.setPrice(240.0);
        microondas1.setLongDescription("Acaba de preparar tus mejores recetas con el microondas Hisense H23MOBSD1HG, de color negro de 800 W y función grill un potencia grill de 1000W." +
                "Su uso te será muy cómodo y fácil gracias a su panel de control digital táctil.");
        microondas1.setEan("8435484023965");
        productRepository.save(microondas1);

        Product microondas2 = new Product();
        microondas2.setName("Microondas Infiniton MW-1015 ");
        microondas2.setDescription("MICROONDAS DE LIBRE INSTALACIóN");
        microondas2.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToOyx5jy8KmG_nita9xB0fMGrNbFXWuTAV3g&s");
        microondas2.setStock(2);
        microondas2.setPrice(260.0);
        microondas2.setEan("8435484023999");
        productRepository.save(microondas2);

        Product microondas3 = new Product();
        microondas3.setName("Microondas Infiniton MW-1015 ");
        microondas3.setDescription("MICROONDAS DE LIBRE INSTALACIóN");
        microondas3.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToOyx5jy8KmG_nita9xB0fMGrNbFXWuTAV3g&s");
        microondas3.setStock(2);
        microondas3.setPrice(180.0);
        microondas3.setEan("8435484023976");
        productRepository.save(microondas3);

        Product microondas4 = new Product();
        microondas4.setName("Microondas Infiniton MW-1015 ");
        microondas4.setDescription("MICROONDAS DE LIBRE INSTALACIóN");
        microondas4.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToOyx5jy8KmG_nita9xB0fMGrNbFXWuTAV3g&s");
        microondas4.setStock(2);
        microondas4.setPrice(110.0);
        microondas4.setEan("8435484023225");
        productRepository.save(microondas4);

        Product microondas5 = new Product();
        microondas5.setName("Microondas Infiniton MW-1015 ");
        microondas5.setDescription("MICROONDAS DE LIBRE INSTALACIóN");
        microondas5.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToOyx5jy8KmG_nita9xB0fMGrNbFXWuTAV3g&s");
        microondas5.setStock(2);
        microondas5.setPrice(100.0);
        microondas5.setEan("8435484023911");
        productRepository.save(microondas5);

        Product labadora1 = new Product();
        labadora1.setName("Lavadora LG Automática 11kg");
        labadora1.setDescription("Lava y seca, 11 Kg");
        labadora1.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5ouqlTXRtGRs0SN55qjgqioa8MHW3U9tDLA&s");
        labadora1.setStock(2);
        labadora1.setPrice(450.0);
        labadora1.setEan("8435484023944");
        productRepository.save(labadora1);

        Product labadora2 = new Product();
        labadora2.setName("Lavadora LG Automática 11kg");
        labadora2.setDescription("Lava y seca, 11 Kg");
        labadora2.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5ouqlTXRtGRs0SN55qjgqioa8MHW3U9tDLA&s");
        labadora2.setStock(2);
        labadora2.setPrice(400.0);
        labadora2.setEan("8435484023913");
        productRepository.save(labadora2);

        Product labadora3 = new Product();
        labadora3.setName("Lavadora LG Automática 11kg ");
        labadora3.setDescription("Lava y seca, 11 Kg");
        labadora3.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5ouqlTXRtGRs0SN55qjgqioa8MHW3U9tDLA&s");
        labadora3.setStock(2);
        labadora3.setPrice(320.0);
        labadora3.setEan("8435484023952");
        productRepository.save(labadora3);

        Product labadora4 = new Product();
        labadora4.setName("Lavadora LG Automática 11kg ");
        labadora4.setDescription("Lava y seca, 11 Kg");
        labadora4.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5ouqlTXRtGRs0SN55qjgqioa8MHW3U9tDLA&s");
        labadora4.setStock(2);
        labadora4.setPrice(760.0);
        labadora4.setEan("8435484023976");
        productRepository.save(labadora4);

        Product labadora5 = new Product();
        labadora5.setName("Lavadora LG Automática 11kg ");
        labadora5.setDescription("Lava y seca, 11 Kg ");
        labadora5.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5ouqlTXRtGRs0SN55qjgqioa8MHW3U9tDLA&s");
        labadora5.setStock(2);
        labadora5.setPrice(400.0);
        labadora5.setEan("8435484023951");
        productRepository.save(labadora5);

        Product secadora1 = new Product();
        secadora1.setName("Bolero Wash&Dry 10700 Inverter");
        secadora1.setDescription("Secadora 10 Kg ");
        secadora1.setImage("https://media.cecotec.cloud/02339/bolero-washdry-10700-inverter_1.png:md");
        secadora1.setStock(2);
        secadora1.setPrice(556.0);
        secadora1.setEan("8435484023996");
        productRepository.save(secadora1);

        Product secadora2 = new Product();
        secadora2.setName("Bolero Wash&Dry 10700 Inverter");
        secadora2.setDescription("Secadora 10 Kg ");
        secadora2.setImage("https://media.cecotec.cloud/02339/bolero-washdry-10700-inverter_1.png:md");
        secadora2.setStock(2);
        secadora2.setPrice(530.0);
        secadora2.setEan("8435484023971");
        productRepository.save(secadora2);

        Product secadora3 = new Product();
        secadora3.setName("Bolero Wash&Dry 10700 Inverter");
        secadora3.setDescription("Secadora 10 Kg");
        secadora3.setImage("https://media.cecotec.cloud/02339/bolero-washdry-10700-inverter_1.png:md");
        secadora3.setStock(2);
        secadora3.setPrice(556.0);
        secadora3.setEan("8435484023983");
        productRepository.save(secadora3);

        Product secadora4 = new Product();
        secadora4.setName("Bolero Wash&Dry 10700 Inverter ");
        secadora4.setDescription("Secadora 10 Kg");
        secadora4.setImage("https://media.cecotec.cloud/02339/bolero-washdry-10700-inverter_1.png:md");
        secadora4.setStock(2);
        secadora4.setPrice(570.0);
        secadora4.setEan("8435433323996");
        productRepository.save(secadora4);

        Product secadora5 = new Product();
        secadora5.setName("Bolero Wash&Dry 10700 Inverter ");
        secadora5.setDescription("Secadora 10 Kg");
        secadora5.setImage("https://media.cecotec.cloud/02339/bolero-washdry-10700-inverter_1.png:md");
        secadora5.setStock(2);
        secadora5.setPrice(810.0);
        secadora5.setEan("8435484023888");
        productRepository.save(secadora5);

        Product combi1= new Product();
        combi1.setName("Indesit CAA 55 NX 1");
        combi1.setDescription("Combi F Acero Inoxidable");
        combi1.setImage("https://thumb.pccomponentes.com/w-530-530/articles/33/336761/1741-indesit-caa-55-nx-1-frigorifico-combi-a-acero-inoxidable-fff1e7d2-ac52-41ec-bb57-836188161ed5.jpg");
        combi1.setStock(2);
        combi1.setPrice(600.0);
        combi1.setLongDescription("Frigorífico con congelador Indesit CAA 55 NX 1 con diseño en acero inoxidable, estantes de vidrio con perfiles de frente, proporcionando robustez y seguridad adicional." +
                "Un compartimento de gran capacidad para tus frutas y verduras.");
        combi1.setEan("8050147603345");
        productRepository.save(combi1);

        Product combi2= new Product();
        combi2.setName("Bolero CoolMarket Combi 495");
        combi2.setDescription("Frigorífico combi con nevera y congelador");
        combi2.setImage("https://media.cecotec.cloud/02391/frigorifico-bolero-coolmarket-combi-495-inox_ygm6f2_1.png:md");
        combi2.setStock(2);
        combi2.setPrice(900.0);
        combi2.setLongDescription("Frigorífico dos puertas con gran capacidad. Óptima conservación de alimentos." +
                "Capacidad 495 L. Gran capacidad.Clase E. Ahorro energético día a día.");
        combi2.setEan("8435484023917");
        productRepository.save(combi2);
    }
}





