package com.av4sec.persistance.document;

import org.springframework.core.annotation.Order;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by martinlinha on 01.04.17.
 */
@Document
public class User {

  @Id
  private String id;
  private String firstname;
  private String lastname;
  private String email;
  @CreatedDate
  private Date createdOn;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    User user = new User();

    public Builder firstname(String firstname) {
      user.setFirstname(firstname);
      return this;
    }

    public Builder lastname(String lastname) {
      user.setLastname(lastname);
      return this;
    }

    public Builder email(String email) {
      user.setEmail(email);
      return this;
    }


    public User build() {
      return user;
    }
  }
}
