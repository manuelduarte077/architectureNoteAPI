package com.tasks.architectureAPI.domain.ports.in;

import com.tasks.architectureAPI.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface IRetrieveTaskUseCase {
    Optional<Task> getTask(Long id);

    List<Task> getAllTask();

}
