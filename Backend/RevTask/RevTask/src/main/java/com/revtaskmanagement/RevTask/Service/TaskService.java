package com.revtaskmanagement.RevTask.Service;

import com.revtaskmanagement.RevTask.Entity.Task;
import com.revtaskmanagement.RevTask.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {

        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {

        return taskRepository.findById(id).orElseThrow();
    }

    public Task createTask(Task task) {

        return taskRepository.save(task);
    }

//    public Task updateTask(Long id, Task taskDetails) {
//        Task task = taskRepository.findById(id).orElseThrow();
//        task.setTitle(taskDetails.getTitle());
//        task.setDescription(taskDetails.getDescription());
//        task.setStatus(taskDetails.getStatus());
//        task.setPriority(taskDetails.getPriority());
//        task.setAssignedTo(taskDetails.getAssignedTo());
//        task.setAssignDate(taskDetails.getAssignDate());
//        task.setDueDate(taskDetails.getDueDate());
//        return taskRepository.save(task);
//    }

    public void deleteTask(Long id) {

        taskRepository.deleteById(id);
    }
}
