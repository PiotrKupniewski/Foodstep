package pl.kupniewski.model.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

    private String cardHolderName;
    private Long userId;
    private String uniquNumberId;
    private LocalDate expirationDate;
    private Integer cvnNumber;

}
