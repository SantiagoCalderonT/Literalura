# Literalura | Alura Challenge

## Descripción

El proyecto **Literalura** es una aplicación de consola construida con Spring Boot que utiliza PostgreSQL para gestionar libros y autores. Esta aplicación permite realizar diversas operaciones, como buscar libros por título, listar todos los libros registrados, buscar autores por nombre, entre otras funcionalidades.

## Funcionalidades

1. Encuentra un libro en una API externa y lo guarda en la base de datos si está disponible.
2. Despliega todos los libros guardados en la base de datos.
3. Despliega todos los autores registrados en la base de datos.
4. Busca autores que fallecieron después de un año especificado.
5. Filtra los libros según el idioma indicado.
6. Muestra estadísticas sobre el número total de descargas de los libros.
7. Muestra los 10 libros más descargados.
8. Busca autores por nombre en la base de datos.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.3.2-SNAPSHOT**
- **PostgreSQL**
- **Maven**
- **Lombok**
- **JPA / Hibernate**
- **Jackson para procesamiento JSON**
- **Jansi para colorear la salida en la consola**

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **`.literalura`**: Contiene la clase principal `Application` para iniciar la aplicación.
- **`.service`**: Contiene la clase `ConsumeApi` para consumir la API externa de libros.
- **`.repository`**: Contiene los repositorios `BookRepository` y `AuthorRepository` para interactuar con la base de datos.
- **`.principal`**: Contiene la clase `Principal` que maneja el menú y la lógica de la aplicación.
- **`.model`**: Contiene las clases de entidad `Book` y `Author` que representan las tablas en la base de datos.
- **`.dto`**: Contiene las clases `DataBook`, `DataAuthor`, y `Data` para representar los datos obtenidos de la API externa.
- **`.converter`**: Contiene la interfaz `IConverter` y la clase `Converter` para convertir datos JSON a objetos Java.

## Modelo de la base de datos

![model_bd](https://github.com/user-attachments/assets/3df689ee-4f34-4a5e-8e88-b7f951cd16a5)


## Uso

Una vez que la aplicación esté corriendo, verás un menú en la consola con las siguientes opciones:

1. Buscar libro por título
2. Listar libros registrados
3. Listar autores registrados
4. Listar autores vivos en un año determinado
5. Listar libros por idioma
6. Generar estadísticas del número de descargas
7. Listar el top 10 de libros más descargados
8. Buscar autor por nombre
9. Salir

## Ejemplo

![imagen](https://github.com/user-attachments/assets/40fa61c1-497e-47cc-90a1-d8d64adc5575)

![imagen](https://github.com/user-attachments/assets/0229ab4e-33c2-41d3-bb61-387ec3a285b8)

