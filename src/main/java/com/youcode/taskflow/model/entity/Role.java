package com.youcode.taskflow.model.entity;
import com.youcode.taskflow.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private UserRole name;
}
