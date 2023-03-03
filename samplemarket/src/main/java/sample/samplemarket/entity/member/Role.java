package sample.samplemarket.entity.member;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Enumerated(EnumType.STRING) // 1번
    @Column(nullable = false, unique = true) // 2번
    private RoleType roleType;

    public Role(RoleType roleType){
        this.roleType = roleType;
    }
}
