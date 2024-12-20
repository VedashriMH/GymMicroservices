package com.ust.GymService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymDto {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getNoTrainers() {
        return noTrainers;
    }

    public void setNoTrainers(int noTrainers) {
        this.noTrainers = noTrainers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int id;
    public String gName;
    public int noTrainers;
    public String location;
}
