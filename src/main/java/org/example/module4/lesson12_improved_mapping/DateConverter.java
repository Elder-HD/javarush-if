package org.example.module4.lesson12_improved_mapping;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter(autoApply = true)
public class DateConverter implements AttributeConverter<LocalDate , String> {
    public String convertToDatabaseColumn(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("yy.MM.dd"));
    }

    public LocalDate convertToEntityAttribute(String dbData) {
        LocalDate date = LocalDate.parse(dbData, DateTimeFormatter.ofPattern("yy.MM.dd"));
        return date.getYear() > LocalDate.now().getYear() ? date.withYear(date.getYear() - 100) : date;
    }

}
