package com.springboot.di.app;

import com.springboot.di.app.models.domain.ItemFactura;
import com.springboot.di.app.models.domain.Producto;
import com.springboot.di.app.models.service.IServicio;
import com.springboot.di.app.models.service.MiServicio;
import com.springboot.di.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara 1",100);
        Producto producto2 = new Producto("Camara 2",200);
        Producto producto3 = new Producto("Camara 3",300);

        ItemFactura itemFactura1 = new ItemFactura(producto1,2);
        ItemFactura itemFactura2 = new ItemFactura(producto3,3);
        ItemFactura itemFactura3 = new ItemFactura(producto2,4);

        return Arrays.asList(itemFactura1,itemFactura2,itemFactura3);


    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("PC 1",100);
        Producto producto2 = new Producto("PC 2",200);
        Producto producto3 = new Producto("PC 3",300);

        ItemFactura itemFactura1 = new ItemFactura(producto1,2);
        ItemFactura itemFactura2 = new ItemFactura(producto3,3);
        ItemFactura itemFactura3 = new ItemFactura(producto2,4);

        return Arrays.asList(itemFactura1,itemFactura2,itemFactura3);


    }
}
