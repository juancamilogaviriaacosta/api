package com.colpatria.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import io.swagger.annotations.ApiResponse;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	@ApiOperation(value = "Servicio de listar las Tarifas por area.", notes = "Servicio para listar las Tarifas por area.")
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Excepcion controlada de Sigcs, indicando error en listar las Tarifas por area", responseHeaders = {
					@ResponseHeader(name = "Error en listar las Tarifas por area", description = "Informe de error enviado por backend") }),
			@ApiResponse(code = 200, message = "Lista de las Tarifas por area") })
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}