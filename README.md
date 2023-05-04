# Biblioteca

Este proyecto es una aplicación de consola que simula el funcionamiento de una biblioteca. Está desarrollado en Java y utiliza una serie de clases para gestionar los socios, los libros y los préstamos.

## Funcionalidades

La aplicación ofrece las siguientes funcionalidades:

- **Ver Libros:** Muestra una lista de todos los libros de la biblioteca.
- **Ver Autores:** Muestra una lista de todos los autores de la biblioteca, junto con sus libros.
- **Realizar Préstamo:** Permite al usuario realizar un préstamo de un libro.
- **Realizar Devolución:** Permite al usuario devolver un libro que ha sido prestado.
- **Salir:** Cierra la aplicación.

## Cómo usar la aplicación

Para utilizar la aplicación, simplemente hay que ejecutar la clase `Test` desde el IDE o la línea de comandos. A continuación, se mostrará un menú con las diferentes opciones disponibles.

Para realizar un préstamo, el usuario debe introducir el número del socio y el número del libro que desea tomar prestado. En caso de que el libro esté disponible y el socio no tenga ya el máximo de libros prestados, se creará un nuevo préstamo.

Para devolver un libro, el usuario debe seleccionar el préstamo correspondiente de una lista de préstamos en curso. A continuación, se actualizará la información del préstamo y se marcará como finalizado.

## Estructura del proyecto

El proyecto está organizado en varias clases:

- **Socio:** Representa a un socio de la biblioteca, con su nombre, su número de socio y su límite de préstamos.
- **Autor:** Representa a un autor de libros, con su nombre y sus libros publicados.
- **Libro:** Representa a un libro, con su título, su autor y su disponibilidad.
- **Prestamo:** Representa a un préstamo de un libro por un socio, con la fecha de inicio y la fecha de devolución.
- **Test:** Clase principal que contiene el menú de la aplicación y los métodos para realizar préstamos, devoluciones y mostrar información de la biblioteca.

## Contribuir

Si quieres contribuir a este proyecto, puedes hacerlo a través de pull requests en GitHub.

