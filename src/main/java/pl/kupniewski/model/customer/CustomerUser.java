package pl.kupniewski.model.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.kupniewski.model.shared.CreditCard;
import pl.kupniewski.model.shared.User;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerUser extends User {

    private CustomerOrderHistory history;
    private Long minRangeArea;
    private CreditCard orderCart;
    
}
