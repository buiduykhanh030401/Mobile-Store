package com.r2s.mobilestore.user.dtos;

import com.r2s.mobilestore.utils.Constants;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import jakarta.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * This class is used to update User
 *
 * @author KhanhBD
 * @since 2023-10-09
 */
@Data
public class UpdateUserDTO {
    @Size(min = 2, max = 64, message = Constants.FULL_NAME_INVALID)
    private String fullName;

    @Pattern(regexp = "^[0-9]{10}$", message = Constants.PHONE_NUMBER_INVALID)
    private String phoneNumber;

    @Pattern(regexp = "^(MALE|FEMALE)$", message = Constants.GENDER_INVALID)
    private String gender;

    @Past(message = Constants.DATE_OF_BIRTH_NOT_VALID)
    @NotNull(message = Constants.DATE_OF_BIRTH_NOT_NULL)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
}
