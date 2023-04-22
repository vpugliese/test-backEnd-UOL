package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class PlayerEntity {

    @Id
    private Long id;
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;
    private Long phone;
    private String codename;
    private String group;

}