SOLUCIÓN DESAFÍO UNO -> 
	AUTOR:  Yuri Pérez Garrido 
			yuriperezgarrido@hotmail.com
			
DESCRIPCIÓN DEL APLICATIVO:
	Permitir visualizar y entregar las fechas faltantes que genera el servicio de GDD
	
INSTALACIÓN Y EJECUCIÓN (Probado en LINUX):
	- Descargar el proyecto maven y ejecutar el siguiente comando:
		mvn clean install
		
	- Una vez compilado rescata el .jar generado ya sea en la carpeta del .m2 o dentro de la carpeta target del proyecto y sobre el .jar generado "YuriApp.jar" ejecuta el siguiente comando:
	
	java -jar MI_RUTA/YuriApp.jar & 
	
veras un consola de arranque y luego podrás acceder a la ruta 
	http://localhost:8082/swagger-ui.html
	
y ejecutar el servicio test-controller -> generate para obtener un resultado.


CONSIDERACIONES:
	- Este proyecto arranca en el puerto 8082
	- Si se desea cambiar el servicio que consume debes dirigirte a application.properties y cambiar el propertie:
		consumer.app.periodos LA RUTA DEFAULT DEL SERVICIO GDD SERÁ: http://localhost:8080/periodos/api
	- Un archivo de entrada y de salida se encuentra en la carpeta resources del proyecto
		
		

 	
	
	