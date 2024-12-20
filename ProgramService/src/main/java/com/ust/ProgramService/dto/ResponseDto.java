package com.ust.ProgramService.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private ProgramDto programDto;
    private List<CustomerDto> customerDtos;

    public ProgramDto getProgramDto() {
        return programDto;
    }

    public void setProgramDto(ProgramDto programDto) {
        this.programDto = programDto;
    }

    public List<CustomerDto> getCustomerDtos() {
        return customerDtos;
    }

    public void setCustomerDtos(List<CustomerDto> customerDtos) {
        this.customerDtos = customerDtos;
    }
}
