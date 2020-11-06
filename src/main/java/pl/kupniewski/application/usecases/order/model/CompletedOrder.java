package pl.kupniewski.application.usecases.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompletedOrder {
    private String status;
}
