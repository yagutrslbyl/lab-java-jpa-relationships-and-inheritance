package org.example.nurse.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name="assosiation_id")
    private Association association;


    @OneToOne
    @JoinColumn(name = "prezident_id")
    private Member president;


    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Member> members;

    public Division() {}

    public Division(String name, String district) {
        this.name = name;
        this.district = district;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
public  Association getAssociation() {
        return association;
    }
    public void setAssociation(Association association) {
        this.association = association;
    }


public Member getPresident() {
        return president;
}
public void setPresident(Member president) {
        this.president = president;
}

public List<Member> getMember() {
        return members;
}
public void setMembers(List<Member> member) {
        this.members = member;
}
}
