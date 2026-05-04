package com.evembackend.converter;

import com.evembackend.enums.CategoryEnum;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<CategoryEnum,String> {

    @Override
    public String convertToDatabaseColumn(CategoryEnum attribute) {
        return (attribute != null) ? attribute.getName() : null;
    }

    @Override
    public CategoryEnum convertToEntityAttribute(String dbData) {
        return (dbData != null) ? CategoryEnum.fromName(dbData) : null;
    }
    
}
