package com.colpatria.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colpatria.api.entidades.Cliente;
import com.colpatria.api.wsdl.ListOfListOfValuesType;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
public class ApiController {

	@GetMapping("/autenticar")
	@ApiOperation(value = "Autenticar", notes = "Autenticarse en el sistema")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Token activo"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public String autenticar(String user, String pass) {
		return UUID.randomUUID().toString();
	}

	@GetMapping("/consultaCliente")
	@ApiOperation(value = "Consultar cliente", notes = "Consultar un cliente en el sistema")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Informacion del cliente"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public Cliente consultaCliente(String token, String identificacion) {
		Cliente c = new Cliente();
		c.setNombres("Juan");
		c.setApellidos("Gaviria");
		c.setIdentificacion(identificacion);
		return c;
	}

	@PostMapping("/crearCliente")
	@ApiOperation(value = "Crear cliente", notes = "Crear un cliente en el sistema")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Proceso exitoso"),
			@ApiResponse(code = 201, message = "Creado"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public String crearCliente(String token, Cliente c) {
		return "SUCCESSFUL";
	}

	@PutMapping("/modificarCliente")
	@ApiOperation(value = "Modificar cliente", notes = "Modifica un cliente del sistema")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Proceso exitoso"),
			@ApiResponse(code = 201, message = "Modificado"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public String modificarCliente(String token, Cliente c) {
		return "SUCCESSFUL";
	}
	
	@GetMapping("/getBEPSoap")
	@ApiOperation(value = "getBEPSoap", notes = "getBEPSoap en el sistema")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Token activo"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public String getBEPSoap(double fixedCost, double variableCost, double returnsPerUnit) {
		SoapSupport ss = new SoapSupport();
		String resp = ss.getBreakEvenPointResult(fixedCost, variableCost, returnsPerUnit);
		return resp;
	}
	
	@GetMapping("/customerListOfValuesQuery")
	@ApiOperation(value = "customerListOfValuesQuery", notes = "customerListOfValuesQuery en el sistema")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Token activo"),
			@ApiResponse(code = 401, message = "No autorizado"),
			@ApiResponse(code = 403, message = "Excepcion controlada de por el sistema"), 
			@ApiResponse(code = 404, message = "No encontrado") })
	public ListOfListOfValuesType customerListOfValuesQuery(String transactionId, String serviceCode, String operationCode, String requestUser, String requestSystem, String channel, String host, String executionMode, String operationCountry, String operationBank, String transactionDate, String transactionTime, String officeCode, String numberPages, String totalPages, String institutionCode, String username, String password, String querylistofvaluesType) {
		SoapSupport ss = new SoapSupport();
		ListOfListOfValuesType resp = ss.customerListOfValuesQuery(transactionId, serviceCode, operationCode, requestUser, requestSystem, channel, host, executionMode, operationCountry, operationBank, transactionDate, transactionTime, officeCode, numberPages, totalPages, institutionCode, username, password, querylistofvaluesType);
		return resp;
	}
}
