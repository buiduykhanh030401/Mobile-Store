package com.r2s.mobilestore.utils;

/**
 * Declaring all constants
 *
 * @author kyle
 * @since 2023-09-01
 */
public class Constants {
    public static final String DATA_ID_NOT_FOUND = "data.id.notFound";

    //====== ADD 2023/09/02 kyle START ======//
    public static final String DATA_NOT_FOUND = "data.notFound";
    public static final String DATA_SAVE_SUCCESSFULLY = "data.save.successfully";
    public static final String DATA_SAVE_FAILED = "data.save.failed";
    public static final String DATA_DELETE_SUCCESSFULLY = "data.delete.successfully";
    public static final String DATA_DELETE_FAILED = "data.delete.failed";
    public static final String SERVER_NAME = "server.name";
    //====== 2023/09/02 kyle END ======//

    //====== 2023/09/05 kyle START ======//
    /**
     * Expire duration for JWT
     */
    public static final int EXPIRE_DURATION = 36000;

    public static final String ADMIN = "admin";

    public static final String MOD = "moderator";

    public static final String USER = "user";


    public static final String USERNAME_NOT_FOUND = "username.notFound";

    public static final String AUTHORIZATION_TYPE = "Bearer";

    public static final String USERNAME_EXIST = "username.exist";

    public static final String EMAIL_EXIST = "email.exist";

    public static final String ROLE_NOT_FOUND = "role.notFound";
    //====== 2023/09/05 kyle END ======//

    //====== 2023/10/19 KhanhBD START ======//
    public static final String EMAIL_MESSAGE = "email.message";
    public static final String EMAIL_SUBJECT = "email.subject";
    public static final String EMAIL_NOT_FOUND = "email.notFound";
    public static final String R2S = "r2s";
    //====== 2023/10/19 KhanhBD END ======//
    //====== 2023/10/23 KhanhBD START ======//
    public static final String VALIDATION_FAILED = "validation.failed";
    public static final String EMAIL_NOT_VALID = "Email not valid";
    public static final String PASSWORD_NOT_VALID = "Password must contain at least one lowercase letter, " +
            "one uppercase letter, one special character, and be between 6 and 32 characters in length.";
    public static final String FULL_NAME_INVALID = "fullName must be between 2 and 64 characters";
    public static final String PHONE_NUMBER_INVALID = "phoneNumber must be exactly 10 digits";
    public static final String GENDER_INVALID = "gender must be MALE or FEMALE";
    public static final String DATE_OF_BIRTH_NOT_VALID = "dateOfBirth must be a date in the past";
    public static final String DATE_OF_BIRTH_NOT_NULL = "dateOfBirth must not be null";
    //====== 2023/10/23 KhanhBD END ======//
}
