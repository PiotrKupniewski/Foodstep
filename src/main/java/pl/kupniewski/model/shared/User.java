package pl.kupniewski.model.shared;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToSgit tring
public abstract class User {

  private Long UID ;
  private String login;
  private String password;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String emailAddress;
  private List<Address> addresses;
  private CreditCard creditCard;
  private List<Order> orders;



}
