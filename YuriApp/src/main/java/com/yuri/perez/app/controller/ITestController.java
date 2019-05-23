package com.yuri.perez.app.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuri.perez.app.dto.OutputDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "test")
public interface ITestController {

	@ApiOperation(value = "Generador", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Lista recuperada exitosamente"),
			@ApiResponse(code = 401, message = "No estas autorizado para ver el recurso."),
			@ApiResponse(code = 403, message = "Esta prohibido acceder al recurso al que intentabas acceder"),
			@ApiResponse(code = 404, message = "El recurso que intentabas alcanzar no se encuentra") })

	@PostMapping(path = "/generate")
	@ResponseBody OutputDTO generate() throws IOException;
	
}
