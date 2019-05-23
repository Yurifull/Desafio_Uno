package com.yuri.perez.app.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import com.yuri.perez.app.dto.OutputDTO;

@Service
public class GeneratedService {
	
	private static Logger LOGGER = LogManager.getLogger(GeneratedService.class);

	@Value("${consumer.app.periodos}")
	private String pathConsumer;
	
	
	
	public OutputDTO generateBodyRequest() throws IOException {
		
		OutputDTO jsonResponse = callGDD();
	    
		LocalDate initDate = LocalDate.parse(jsonResponse.getFechaCreacion());
		LocalDate endDate = LocalDate.parse(jsonResponse.getFechaFin());
		LOGGER.info("GENERANDO COMBINACIONES DE FECHAS....");
		while(initDate.isBefore(endDate)) {
			initDate = initDate.plusMonths(1);
			jsonResponse.getFechasFaltantes().add(initDate.format(DateTimeFormatter.ISO_LOCAL_DATE));				
		}
		LOGGER.info("LIMPIANDO FECHAS YA VISUALIZADAS....");
		jsonResponse.getFechasFaltantes().removeIf(date->jsonResponse.getFechas().contains(date));
		
		LOGGER.info("FIN DE LA EJECUCIÓN");
		return jsonResponse;
	}



	private OutputDTO callGDD() throws MalformedURLException, IOException, ProtocolException {
		URL obj = new URL(pathConsumer);
		
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setDoOutput(true);
		con.setRequestProperty("Accept", "application/json");
		
		InputStream response = con.getInputStream();
		LOGGER.info("CALL TO...."+ pathConsumer);
		String text = null;
	    try (final Reader reader = new InputStreamReader(response)) {
	        text = CharStreams.toString(reader);
	    }
	    
	    Gson gson=new Gson();
	    
		return gson.fromJson(text,OutputDTO.class);
	}
	
	
	
}
