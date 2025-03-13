package edu.ifba.hello.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    @NotBlank(message = "Não pode ser vazio meu chapa")
    @Size(min = 6, max = 50)
    private String name;

    @NotBlank
    @Email
    private String email;

}
