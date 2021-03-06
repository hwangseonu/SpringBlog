package me.mocha.blog.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User{

    @Id
    @Column(length = 100)
    @Getter
    @Setter
    private String username;

    @Column(nullable = false)
    @Getter
    @Setter
    private String password;

    @Column(nullable = false)
    @Getter
    @Setter
    private String nickname;

    public boolean verify(String password) {
        return this.password.equals(password);
    }

    public boolean equals(User user) {
        if (user == null) return false;
        return user.username.equals(username) && user.nickname.equals(nickname);
    }

}
