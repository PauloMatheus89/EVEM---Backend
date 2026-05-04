package com.evembackend.enums;

public enum StatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DRAFT("draf");

    private final String value;

    StatusEnum(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

    public static StatusEnum fromValue(String value)
    {
        for(StatusEnum status : StatusEnum.values())
        {
            if(status.value.equals(value))
                return status;
        }

        throw new IllegalArgumentException("Valor Inválido " + value);
    }

}
