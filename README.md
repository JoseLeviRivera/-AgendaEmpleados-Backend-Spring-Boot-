# AgendaEmpleados-Backend-Spring-Boot

## Descripción
Una pequeña Api-Rest que se encarga de hacer las operaciones basicas como leer, actualizar, listar, eliminar. Esta aplicación se hizo con la finalidad de practicas e ir conociendo el entorno de los microservicios y el desarrollo de las apis con java; En este caso solamente se hacen dichas operaciones con un dato del tipo empleado, se llega a conectar con angular en un ambiente local. 
<br>
Se puede ingresar al desarrollo del frontend con angular con el sigiente enlace [Aqui](https://github.com/JoseLeviRivera/AgendaEmpleados-Angular)

## ¿Cómo ejecutar el proyecto?
Es importante conocer que se debe de crear la base de datos en MYSQL y modificar el archivo "config.propierties"
<br>
Para ejecutar el proyecto se puede hacer mediante un ide como IntelligeIDEA o por medio de maven.
<br>
1. Ejecuta el siguiente comando para instalar las dependecias:

```
mvn install
```
2. Para limpiar el proyecto
```
mvn clean install
```
3. Para compilar y generar el .jar del proyecto
```
mvn package
```
4. Ejecuta el proyecto con java
```
java -jar target/ReporteTutorados-1.0-SNAPSHOT.jar
```
## Imagénes
![imagen](https://github.com/JoseLeviRivera/AgendaEmpleados-Angular/blob/master/src/assets/github/img.png)
