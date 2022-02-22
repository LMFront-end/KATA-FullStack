package co.com.sofka.katafullStack.controllers;

import co.com.sofka.katafullStack.models.Todo;
import co.com.sofka.katafullStack.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoController {

    /*
     * GET -> Consultar
     * POST -> Crear
     * PUT -> Modificar
     * DELETE -> Eliminar
     * */

    @Autowired
    private TodoServices todoServices;

    // Mostrar todas las tareas
    @GetMapping("/todos")
    public List<Todo> listTodo(){
        return todoServices.listTodo();
    }

    // buscar por id
    @GetMapping("/todo/{id}")
    public Optional<Todo> findById(@PathVariable Long id) {
        return todoServices.findById(id);
    }
    
    // Crear una tarea
    @PostMapping("/todo/create")
    public Todo save(@RequestBody Todo todo){
        return todoServices.save(todo);
    }

    // Actualizar una tarea
    @PutMapping("/todo/update")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoServices.updateTodo(todo);
    }

    // Borrar una tarea
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        todoServices.deleteById(id);
    }





}
