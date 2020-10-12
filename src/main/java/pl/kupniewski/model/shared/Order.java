package pl.kupniewski.model.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private  Long orderId;
    private LocalDateTime orderDateTime;
    private Long addressId;




}
