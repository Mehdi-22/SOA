package com.gestion.service.api.service.rest.exception;

public enum ErrorEnum {

    GLOBAL_500_ERROR_CODE("INTERNAL_ERROR"),
    GLOBAL_500_ERROR_DESCRIPTION("SERVER_SIDE_ERROR"),
    INVALID_CODE_DESCRIPTION("INVALID_CODE"),
    GLOBAL_200_DESCRIPTION("Succeed"),
    GLOBAL_404_DESCRIPTION("Failed");

    private final String error;

    ErrorEnum(String e) { error = e;}

    public String getValue() {
        return error;
    }

    public String getErrorValue() { return error;}

    public String getErrorValue (String description, String data) {
        return String.format(description,data);
    }
}
