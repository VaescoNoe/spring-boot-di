package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicioSimple() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	
	@Bean("itemFactura")
	@Primary
	public List<ItemFactura> registrarItems(){		
		return Arrays.asList(
				new ItemFactura(
						new Producto("Camara Sony", 100)
						, 2),
				new ItemFactura(
						new Producto("Bicicleta", 80)
						, 4),
				new ItemFactura(
						new Producto("PS4", 150)
						, 4)
				);
	}
	
	@Bean("itemFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){		
		return Arrays.asList(
				new ItemFactura(
						new Producto("MonitorLG", 100)
						, 2),
				new ItemFactura(
						new Producto("Notebook Asus", 80)
						, 1),
				new ItemFactura(
						new Producto("Impresora HP", 150)
						, 3),
				new ItemFactura(
						new Producto("Escritorio", 150)
						, 4)
				);
	}
	
}
