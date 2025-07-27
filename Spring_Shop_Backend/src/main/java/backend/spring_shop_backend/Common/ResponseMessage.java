package backend.spring_shop_backend.Common;

public interface ResponseMessage {

    // HTTP Status 200
    String SUCCESS = "Success";

    // HTTP Status 400
    String VALIDATION_FAILED = "Validation Failed.";
    String DUPLICATE_EMAIL = "Duplicate Email.";
    String DUPLICATE_NICKNAME = "Duplicate Nickname.";
    String DUPLICATE_TEL_NUMBER = "Duplicate Tel Number.";
    String NOT_EXIST_USER = "This user does not exist.";
    String NOT_EXIST_BOARD = "This board does not exist.";

    // HTTP Status 401
    String SIGN_IN_FAIL = "Login Information Mismatch.";
    String AUTHORIZATION_FAIL = "Authorization Failed.";

    // HTTP Status 403
    String NO_PERMISSION = "Do not have permission.";

    // HTTP Status 500
    String DATABASE_ERROR = "Database Error.";
}
