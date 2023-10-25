package com.r2s.mobilestore.user.dtos;

import com.r2s.mobilestore.utils.Constants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;


/**
 * This class is used to send Email
 *
 * @author KhanhBD
 * @since 2023-10-04
 */
@Data
public class EmailDTO {
    @Email(message = Constants.EMAIL_NOT_VALID)
    @Size(min = 6, max = 256, message = Constants.EMAIL_NOT_VALID)
    private String email;

}
