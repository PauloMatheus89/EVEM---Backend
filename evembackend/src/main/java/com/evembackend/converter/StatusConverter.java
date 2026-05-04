package com.evembackend.converter;

import com.evembackend.enums.StatusEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

//autoApply = true → aplica automaticamente pra todos os StatusEnum
@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<StatusEnum,String> {
    
    @Override
    public String convertToDatabaseColumn(StatusEnum status)
    {
        return (status != null) ? status.getValue() : null;
    }

    @Override
    public StatusEnum convertToEntityAttribute(String value) {
        // TODO Auto-generated method stub
        return (value != null) ? StatusEnum.fromValue(value) : null;
    }
}
