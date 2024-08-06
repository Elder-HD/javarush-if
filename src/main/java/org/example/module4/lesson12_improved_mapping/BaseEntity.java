package org.example.module4.lesson12_improved_mapping;

import jakarta.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.util.Objects;

@MappedSuperclass
public class BaseEntity {

    private Timestamp createdOn;

    private Timestamp updatedOn;

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public Timestamp getUpdatedOn() {
        return updatedOn;
    }
}
