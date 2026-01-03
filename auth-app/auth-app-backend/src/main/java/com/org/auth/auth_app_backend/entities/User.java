package com.org.auth.auth_app_backend.entities;







import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_email", unique = true,length = 300)
    private String email;

    @Column(name = "user_name",length = 300)
    private String name;
    private String password;
    private String image;
    private boolean enable=true;
    private Instant createdAt = Instant.now();
    private Instant updatedAt = Instant.now();

    @Enumerated(EnumType.STRING)
    private Provider provider=Provider.LOCAL;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    @PrePersist
    protected void onCreate(){
        Instant now = Instant.now();
        if(createdAt == null)createdAt=now;
        updatedAt=now;
    }

    @PreUpdate
    protected void onUpdate(){
        Instant now = Instant.now();
       updatedAt=Instant.now();
    }
}
