# ElectroIronHack


## Descripción

Esta es una aplicación de Spring Boot que proporciona una API REST simple para la gestión de productos. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una lista de productos, incluyendo detalles como nombre, descripción, precio, stock y URL de imagen.

---

## Características

- **API RESTful**: Proporciona endpoints para crear, recuperar, actualizar y eliminar productos.
- **Configuración de CORS**: Soporta solicitudes de origen cruzado desde un origen específico.
- **Carga de Datos**: Precarga datos de productos de ejemplo al inicio de la aplicación.

---

## Tecnologías Utilizadas

- **Spring Boot**: Framework para construir la aplicación.
- **Spring Data JPA**: Para interacciones con la base de datos.
- **H2 Database**: Base de datos en memoria para propósitos de prueba.
- **Lombok**: Para reducir el código boilerplate en clases de modelo.

---

## Endpoints

### Obtener Todos los Productos

- **GET** `/api/products`
- Devuelve una lista de todos los productos.

### Obtener Producto por ID

- **GET** `/api/products/{id}`
- Devuelve un solo producto basado en el ID proporcionado.
- **Códigos de Respuesta**:
  - 200 OK: Producto encontrado.
  - 404 Not Found: Producto no encontrado.

### Crear Producto

- **POST** `/api/products`
- Crea un nuevo producto.
- **Cuerpo de la Solicitud**:
  - `name`: String (requerido)
  - `description`: String (requerido)
  - `longDescription`: String (opcional)
  - `image`: String (opcional)
  - `stock`: Integer (requerido)
  - `ean`: String (requerido)
  - `price`: Double (requerido)

### Eliminar Producto

- **DELETE** `/api/products/{id}`
- Elimina un producto basado en el ID proporcionado.
- **Códigos de Respuesta**:
  - 204 No Content: Producto eliminado exitosamente.

---

## Instrucciones de Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone <repository-url>
   cd demo
   ```
2. **Construir la aplicación: Asegúrate de tener Maven instalado y ejecuta**:

```bash
mvn clean install
```
3. **Ejecutar la aplicación**:

```bash
mvn spring-boot:run
```
4. **Acceder a la API**:
    La aplicación estará disponible en http://localhost:8080/api/products.

## Configuración de CORS

La aplicación está configurada para permitir solicitudes de origen cruzado desde `http://localhost:5173`. Puedes modificar la clase `WebConfig` para ajustar la configuración de CORS.

---

## Datos de Ejemplo

La aplicación viene con un conjunto de datos de productos predefinidos que se cargarán automáticamente al inicio.

---

## Autor

Carlos Sanahuja
   

