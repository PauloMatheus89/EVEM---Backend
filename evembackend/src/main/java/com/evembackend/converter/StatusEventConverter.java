package com.evembackend.converter;

import com.evembackend.enums.StatusEventEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

//autoApply = true → aplica automaticamente pra todos os StatusEnum
@Converter(autoApply = true)
public class StatusEventConverter implements AttributeConverter<StatusEventEnum,String> {
    
    @Override
    public String convertToDatabaseColumn(StatusEventEnum status)
    {
        return (status != null) ? status.getValue() : null;
    }

    @Override
    public StatusEventEnum convertToEntityAttribute(String value) {
        // TODO Auto-generated method stub
        return (value != null) ? StatusEventEnum.fromValue(value) : null;
    }
}
