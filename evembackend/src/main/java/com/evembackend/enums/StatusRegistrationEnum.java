package com.evembackend.enums;

public enum StatusRegistrationEnum {
    PENDING("pending"),
    PAYMENT_PENDING("paymentPending"),
    CONFIRMED("confirmed"),
    CANCELLED("cancelled"),
    EXPIRED("expired");

    private String statusEvent;

    StatusRegistrationEnum(String statusEvent)
    {
        this.statusEvent = statusEvent;
    }

    public String getStatusEvent()
    {
        return statusEvent;
    }

    public static StatusRegistrationEnum fromStatusEvent(String status)
    {
        for(StatusRegistrationEnum statusRegistration : StatusRegistrationEnum.values())
        {
            if(statusRegistration.statusEvent.equals(status))
                return statusRegistration;

        }

        throw new IllegalArgumentException("Valor inválido");
    }
}
