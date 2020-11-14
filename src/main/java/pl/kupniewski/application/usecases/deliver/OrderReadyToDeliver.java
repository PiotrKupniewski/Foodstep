package pl.kupniewski.application.usecases.deliver;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderReadyToDeliver {
    private final String status;
}
