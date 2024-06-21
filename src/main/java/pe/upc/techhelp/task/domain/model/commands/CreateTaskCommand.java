package pe.upc.techhelp.task.domain.model.commands;

public record CreateTaskCommand(String title, String description, Double cost) {
}
