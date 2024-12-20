package com.ust.ProgramService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "program")
public class Program {

    @Id
    public int id;
    public String pName;

    public int getOprHrs() {
        return oprHrs;
    }

    public void setOprHrs(int oprHrs) {
        this.oprHrs = oprHrs;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public int getId() {
        return id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int oprHrs;
    public int gymId;

}
