package org.example.expensetrackerapi.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class CreateUserRequestDTO {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
}
