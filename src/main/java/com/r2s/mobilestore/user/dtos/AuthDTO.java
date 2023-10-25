package com.r2s.mobilestore.user.dtos;

import com.r2s.mobilestore.utils.Constants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * Represents login feature
 *
 * @author KhanhBD
 * @since 2023-10-03
 */
@Data
public class AuthDTO {
    /**
     * Username to log in
     */
    @Email(message = Constants.EMAIL_NOT_VALID)
    @Size(min = 6, max = 256, message = Constants.EMAIL_NOT_VALID)
    private String email;

    /**
     * Password to log in
     */
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=.*\\d).{6,32}$",
            message = Constants.PASSWORD_NOT_VALID)
    private String password;

}
