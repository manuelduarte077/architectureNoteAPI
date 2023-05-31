package com.tasks.architectureAPI.application.services;


import com.tasks.architectureAPI.domain.models.AdditionalTaskInfo;
import com.tasks.architectureAPI.domain.models.Task;
import com.tasks.architectureAPI.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements ICreateTaskUseCase, IDeleteTaskUseCase, IGetAdditionalTaskInfoUseCase, IRetrieveTaskUseCase, IUpdateTaskUseCase {

    private final ICreateTaskUseCase createTaskUseCase;
    private final IDeleteTaskUseCase deleteTaskUseCase;
    private final IGetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;
    private final IRetrieveTaskUseCase retrieveTaskUseCase;
    private final IUpdateTaskUseCase updateTaskUseCase;

    public TaskService(ICreateTaskUseCase createTaskUseCase, IDeleteTaskUseCase deleteTaskUseCase, IGetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase, IRetrieveTaskUseCase retrieveTaskUseCase, IUpdateTaskUseCase updateTaskUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(taskId);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTask() {
        return retrieveTaskUseCase.getAllTask();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return updateTaskUseCase.updateTask(id, updatedTask);
    }
}
