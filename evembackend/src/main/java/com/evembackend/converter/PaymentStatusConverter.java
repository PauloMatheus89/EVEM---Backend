package com.evembackend.converter;

import com.evembackend.enums.PaymentStatusEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PaymentStatusConverter implements AttributeConverter<PaymentStatusEnum,String> {

    @Override
    public String convertToDatabaseColumn(PaymentStatusEnum attribute) {
        return (attribute != null) ? attribute.getStatus() : null;
    }

    @Override
    public PaymentStatusEnum convertToEntityAttribute(String dbData) {
        return (dbData != null) ? PaymentStatusEnum.fromStatus(dbData) : null;
    } 
    
}
