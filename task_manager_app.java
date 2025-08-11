# README.md

## Task Manager - JavaFX (In-memory CRUD)

Aplicación de escritorio en JavaFX para administrar tareas en memoria (sin base de datos) con funciones de agregar, listar, editar y eliminar.

### Características
- TableView para mostrar las tareas.
- Campos de entrada: título, descripción, prioridad, fecha límite.
- Botones: Agregar, Editar, Eliminar, Limpiar.
- Validaciones básicas.
- Código organizado en modelo, repositorio y controlador.

### Requisitos
- JDK 17+
- JavaFX SDK compatible (o mediante Maven/Gradle)

### Compilación y ejecución (Maven)
```bash
mvn javafx:run
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
    resources/
      styles.css
```

### Uso
1. Ejecuta la aplicación.
2. Llena los campos de título, prioridad, fecha límite y descripción.
3. Usa los botones para realizar las operaciones CRUD.
4. Las tareas se almacenan solo en memoria.


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
