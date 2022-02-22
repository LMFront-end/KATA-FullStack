package co.com.sofka.katafullStack.repositories;


import co.com.sofka.katafullStack.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRespository extends CrudRepository<Todo, Long> {
}
