package dto;

import enums.Group;
import lombok.Data;

@Data
public class PlayerDTO {

    private String name;
    private String email;
    private Long phone;
    private String codename;
    private Group group;

}
