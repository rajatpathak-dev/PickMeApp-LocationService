package com.pickme.pickmeapplocationservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveDriverLocationRequestDto {
    private String driverId;
    private Double latitude;
    private Double longitude;
}
