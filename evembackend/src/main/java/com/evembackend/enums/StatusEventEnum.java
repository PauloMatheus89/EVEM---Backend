package com.evembackend.enums;

public enum StatusEventEnum {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DRAFT("draf");

    private final String value;

    StatusEventEnum(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

    public static StatusEventEnum fromValue(String value)
    {
        for(StatusEventEnum status : StatusEventEnum.values())
        {
            if(status.value.equals(value))
                return status;
        }

        throw new IllegalArgumentException("Valor Inválido " + value);
    }

}
