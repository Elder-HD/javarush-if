package org.example.module4.lesson12_improved_mapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TimeEntityListener {
    public void onPersist(Object entity) {
        if (entity instanceof BaseEntity) {
            BaseEntity baseEntity = (BaseEntity) entity;
            baseEntity.setCreatedOn(now());
        }
    }

    public void onUpdate(Object entity) {
        if (entity instanceof BaseEntity) {
            BaseEntity baseEntity = (BaseEntity) entity;
            baseEntity.setUpdatedOn(now());
        }
    }

    private Timestamp now() {
        return Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }
}
