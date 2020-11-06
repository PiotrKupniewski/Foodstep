package pl.kupniewski.application.usecases.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class PreparedOrder {
    private String status;
}
