package org.example.module4.lesson12_improved_mapping;

import jakarta.persistence.*;
import jakarta.persistence.EnumType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.sql.Types;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.UUID;


@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@EntityListeners(TimeEntityListener.class)
@Table(name = "user_ext")
public class UserExt extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    @Transient
    private String association;

    @Formula("concat(name,age)")
    private String nameAndAge;

    @JdbcType(VarcharJdbcType.class) //OR:
    @JdbcTypeCode(SqlTypes.VARCHAR) // OR Types.class
    private int inn;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    private PassportInfo passportInfo;

    @Temporal(value = TemporalType.DATE)
    private Date dateAsDate = new Date();
    @Temporal(value = TemporalType.TIME)
    private Date dateAsTime = new Date();
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dateAsTimeStamp = new Date();

    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date creationDate;
    private Date updateDate;

    @Lob
    @Column(name = "photo", columnDefinition="BLOB")
    private byte[] photo;

    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, String> jsonProps;

    @JdbcTypeCode(SqlTypes.SQLXML)
    private Map<String, String> xmlProps;

    @Column(name="join_date")
    @Convert(converter = DateConverter.class)
    private LocalDate convertedDate;

    @PreUpdate
    private void onUpdate() {
        updateDate = new Date();
    }

}