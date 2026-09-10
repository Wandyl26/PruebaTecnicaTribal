# PruebaTecnicaTribal

#Reto técnico para Tribal

Aplicación cuyo objetivo es mostrar distintas categorías usando la API de Chuck Norris Jokes (https://api.chucknorris.io/jokes/categories), tal como se planteó en el desafío. Fue construida siguiendo buenas prácticas de desarrollo, con principios de arquitectura limpia, patrón MVVM, vistas declarativas con jetpack compose y coroutines para gestionar la asincronía.

# Capa de vistas

Se encarga de la interfaz y de la interacción con el usuario. Está compuesta por:

- ui: recursos visuales de la aplicación.

- view: contiene las vistas y actividad de la aplicación.

- viewmodels: implementa los ViewModel que manejan la lógica de presentación y la comunicación con la capa de dominio.

# Capa de dominio

Responsable de la lógica de negocio y de definir los modelos de datos. Incluye:

- services: Se encarga de comunicarse con la capa de vistas para el consumo de los servicios.

- exception: define los distintos tipos de excepciones que puede manejar la aplicación.

- repository: establece la comunicación con la capa de infraestructura para obtener datos desde la API u otras fuentes.



# Capa de infraestructura

Encargada de la comunicación con el backend y la persistencia de datos. Funciona como enlace entre la capa de dominio y la de presentación. Está compuesta por:

- modulos: se encarga de implementar los módulos de inyección de dependencias, dispachers y retrofit.

- api: aquí se encuentran los endpoints.

- service: se encarga de comunicarse con la API.



# Arquitectura y estructura

El proyecto está dividido en tres capas principales:

- Infraestructura: gestiona la comunicación con el backend o las APIs.

- Vistas (app): administra la interfaz de usuario.

- Dominio: concentra la lógica de negocio.

# Test

Se incluye prueba instrumentada en la capa de vistas o app