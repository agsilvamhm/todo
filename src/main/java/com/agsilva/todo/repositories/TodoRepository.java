package com.agsilva.todo.repositories;

import com.agsilva.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Query("Select obj from Todo obj where obj.finalizado = false order by obj.dataParaFinalizar")
    List<Todo> findAllOpen();

    @Query("Select obj from Todo obj where obj.finalizado = true order by obj.dataParaFinalizar")
    List<Todo> findAllClose();

}
