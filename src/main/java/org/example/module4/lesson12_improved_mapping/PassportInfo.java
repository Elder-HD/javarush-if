package org.example.module4.lesson12_improved_mapping;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PassportInfo {
    private int code;
    private String country;
    private String signedBy;

}
