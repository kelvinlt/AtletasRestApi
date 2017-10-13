package com.kelvin.atlteasrestapi.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Medalla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Enum type;
    private String speciality;
    private String competition;

    @ManyToOne
    private Atleta atleta;

    public Medalla() {
    }

    public Medalla(Enum type, String speciality, String competition) {
        this.type = type;
        this.speciality = speciality;
        this.competition = competition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medalla medalla = (Medalla) o;

        if (id != null ? !id.equals(medalla.id) : medalla.id != null) return false;
        if (type != null ? !type.equals(medalla.type) : medalla.type != null) return false;
        if (speciality != null ? !speciality.equals(medalla.speciality) : medalla.speciality != null) return false;
        return competition != null ? competition.equals(medalla.competition) : medalla.competition == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (speciality != null ? speciality.hashCode() : 0);
        result = 31 * result + (competition != null ? competition.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", type=" + type +
                ", speciality='" + speciality + '\'' +
                ", competition='" + competition + '\'' +
                '}';
    }
}
