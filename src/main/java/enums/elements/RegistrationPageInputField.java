package enums.elements;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RegistrationPageInputField {
    FIRST_NAME_FIELD("firstname"),
    LAST_NAME_FIELD("lastname"),
    EMAIL_FIELD("email"),
    TELEPHONE_FIELD("telephone"),
    PASSWORD_FIELD("password"),
    CONFIRM_PASSWORD_FIELD("confirm");

    private final String xpathField;

    @Override
    public String toString(){
        return xpathField;
    }
}
