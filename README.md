Ejercicio 3 - Registro de Eventos (Logger) Básico

Explicación del programa

En este ejercicio se creó una clase llamada Logger que aplica el patrón Singleton para centralizar el registro de eventos de la aplicación.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Un constructor privado para evitar la creación directa con new.
- Un método estático público llamado getInstancia() que devuelve siempre la misma instancia única.
- Un método público registrar() que recibe el nivel de severidad y el mensaje, añadiendo una marca de tiempo automática.

Luego, dentro del método main, se obtienen dos referencias al logger:
Logger log1 = Logger.getInstancia();
Logger log2 = Logger.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias son iguales y para registrar mensajes de tipo INFO, WARNING y ERROR por consola.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la instanciación externa mediante un constructor privado.
- Controlar que el acceso al sistema de registro se realice a través de una única instancia global compartida.
- Incorporar una marca de tiempo (timestamp) en cada mensaje registrado para mantener un orden cronológico claro.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true
[12:34:56.789] [INFO] Aplicación iniciada correctamente.
[12:34:56.790] [WARNING] Uso de memoria elevado.
[12:34:56.790] [ERROR] No se pudo conectar a la base de datos.

Captura de pantalla

<img width="674" height="200" alt="image" src="https://github.com/user-attachments/assets/6913a88f-3825-4c97-8624-4e7f1824c2e5" />
