package com.datum.swaggerejemplo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SwaggerEjemploApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		// Verificar que el contexto de la aplicación se cargue correctamente
		assertNotNull(applicationContext, "El contexto de la aplicación no debe ser nulo");
	}

}
