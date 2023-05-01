package com.agsilva.todo.services;

import com.agsilva.todo.domain.Todo;
import com.agsilva.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", LocalDateTime.parse("01/05/2023 05:05", formatter), false);
        Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", LocalDateTime.parse("02/05/2023 12:05", formatter), false);
        Todo t3 = new Todo(null, "Exercícios", "Praticar exercícios físicos", LocalDateTime.parse("04/05/2023 06:00", formatter), true);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", LocalDateTime.parse("06/05/2023 14:20", formatter), true);
        Todo t5 = new Todo(null, "Inglês", "Assistir a um episódio em inglês", LocalDateTime.parse("06/05/2023 15:00", formatter), false);
        
        
        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));
    }

}
