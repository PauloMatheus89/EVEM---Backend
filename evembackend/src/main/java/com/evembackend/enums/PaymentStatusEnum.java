package com.evembackend.enums;

public enum PaymentStatusEnum {
    PENDING("pending"),
    PROCESSING("processing"),
    PAID("paid"),
    FAILED("failed"),
    CANCELLED("cancelled"),
    REFUNDED("refunded"),
    CHARGEBACK("chargeback"),
    AUTHORIZED("authorized");

    private String status;

    PaymentStatusEnum(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public static PaymentStatusEnum fromStatus(String status)
    {
        for(PaymentStatusEnum statusEnum : PaymentStatusEnum.values())
        {
            if(statusEnum.status.equals(status))
                return statusEnum;
        }

        throw new IllegalArgumentException("Valor Inválido");
    }
}
