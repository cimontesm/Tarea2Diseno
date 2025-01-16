Patrones de diseño aplicados

Factory Method
Problema: El sistema maneja diferentes tipos de cabinas (suite, cabina con balcón, cabina interior, cabina familiar) que pueden estar en diversos estados (disponible, reservada, ocupada, en mantenimiento).
Aplicación: El Factory Method se puede utilizar para crear instancias de cabinas dependiendo de sus características (tipo de cabina, estado, disponibilidad). Este patrón permite una creación flexible de objetos sin tener que conocer las clases específicas de cabina. Así, el sistema puede gestionar fácilmente la creación de objetos de cabina diferentes sin modificar el código en muchas partes del sistema. Favoreciendo así la extensión del programa para añadir nuevos tipos de cabinas, sin afectar al sistema.

Observer
Problema: El sistema debe notificar a los usuarios sobre el estado de sus reservas, cambios en los itinerarios y otros eventos importantes (por ejemplo, cambios en la política de cancelación, reembolsos).
Aplicación: El patrón Observer permite que el sistema gestione las notificaciones de manera eficiente. En este caso, los usuarios (observadores) pueden registrarse para recibir actualizaciones sobre su reserva (sujeto). Cuando ocurre un cambio (por ejemplo, el estado de la reserva cambia o se actualiza el itinerario), el sistema notifica a todos los usuarios interesados. Esto facilita el envío de notificaciones automáticas y reduce el acoplamiento entre el sistema de reservas y el sistema de notificaciones, haciendo el sistema más flexible y escalable.

Chain of Responsibility
Problema: Los incidentes reportados por los usuarios son atendidos primero por el equipo de atención al cliente y, si no se resuelven, se escalan a la gerencia.
Aplicación: Este puede implementarse para modelar este flujo de manejo de incidentes, permitiendo que cada nivel del sistema procese los problemas según su alcance y escalarlos si es necesario.

Decorator
Problema: El usuario puede pedir servicios adicionales
Aplicacion: Al usar decorator se pueden añadir varios servicios adicionales como Concrete Decorators, ayudando asi a mantener el OCP y haciendo mas facil la adicion de nuevos servicios.
