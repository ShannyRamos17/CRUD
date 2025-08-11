
## Task Manager - JavaFX (In-memory CRUD)

Aplicación de escritorio en JavaFX para administrar tareas en memoria (sin base de datos) con funciones de **Agregar**, **Listar**, **Editar** y **Eliminar**.

### Características
- **TableView** para mostrar las tareas.
- Campos de entrada: **Título** (TextField), **Descripción** (TextArea), **Prioridad** (ComboBox), **Fecha Límite** (DatePicker).
- Botones: **Agregar**, **Editar**, **Eliminar**, **Limpiar**.
- Validaciones básicas de datos.
- Código organizado en **Modelo**, **Repositorio** y **Controlador**.
- Eventos para vincular vista y modelo.

### Requisitos
- **JDK 17+**
- JavaFX SDK compatible (o mediante **Maven/Gradle**)
- Git instalado para subir a GitHub

### Pasos para compilar y ejecutar (Maven)
```bash
mvn clean javafx:run
```

### Estructura del Proyecto
```
src/
  main/
    java/
      com/tuusuario/taskmanager/
        MainApp.java
        model/Task.java
        repo/TaskRepository.java
        controller/TaskController.java
    resources/
      styles.css
```

### Objetivos de la práctica
1. Implementar la lógica CRUD completa.
2. Organizar el código con modelo, repositorio y controlador.
3. Manejar eventos y vincular datos entre vista y modelo.
4. Realizar commits pequeños y descriptivos.
5. Subir el repositorio público a GitHub con README y capturas.

### Uso
1. Ejecuta la aplicación.
2. Completa los campos de **Título**, **Descripción**, **Prioridad** y **Fecha Límite**.
3. Presiona los botones para agregar, editar, eliminar o limpiar.
4. Los datos se manejan solo en memoria (se pierden al cerrar la app).


### .gitignore sugerido
```
/target
/build
/.idea
*.iml
*.class
/.vscode
*.log
.DS_Store
```
