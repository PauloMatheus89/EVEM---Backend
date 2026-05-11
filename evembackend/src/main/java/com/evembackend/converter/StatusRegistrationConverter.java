package com.evembackend.converter;

import com.evembackend.enums.StatusRegistrationEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class StatusRegistrationConverter implements AttributeConverter<StatusRegistrationEnum,String>{

    @Override
    public String convertToDatabaseColumn(StatusRegistrationEnum attribute) {
        return (attribute != null) ? attribute.getStatusEvent() : null;
    }

    @Override
    public StatusRegistrationEnum convertToEntityAttribute(String dbData) {
        return (dbData != null) ? StatusRegistrationEnum.fromStatusEvent(dbData) : null;
    }
    
  
}
