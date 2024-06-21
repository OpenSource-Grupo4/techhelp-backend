package pe.upc.techhelp.task.domain.model.commands;

public record UpdateTaskCommand(Long id, String title, String description, Double cost) {
}
