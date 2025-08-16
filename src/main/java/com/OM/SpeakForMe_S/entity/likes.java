package com.OM.SpeakForMe_S.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

@Entity
@Table(name = "likes")
public class likes {

    @UUID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlikes")
    private Long UUID;

    @Column(name = "data")
    private LocalDateTime data;

    public Long getUUID() {
        return UUID;
    }

    public void setUUID(Long UUID) {
        this.UUID = UUID;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
