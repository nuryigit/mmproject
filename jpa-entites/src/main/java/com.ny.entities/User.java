package com.ny.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User {
  @Id
  private Long userId;
  private String firstName;
  private String lastName;
  private String email;

}
