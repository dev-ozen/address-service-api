package com.asd.addressserviceapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponseDto {
    @Id
    private String id;
    private String country;
    private String city;
}
