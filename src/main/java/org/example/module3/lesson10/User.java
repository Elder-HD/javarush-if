package org.example.module3.lesson10;

//{
//    "id": 6901938,
//    "name": "Ivan Franko",
//    "email": "ivan.franko@gmail.com",
//    "gender": "male",
//    "status": "active"
//}

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class User {
    private Long id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
