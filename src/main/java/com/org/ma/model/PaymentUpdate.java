package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonRootName("PaymentUpdate")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentUpdate {

    @JsonProperty("participant_id")
    @NotNull
    private String participantId;

    @JsonProperty("available")
    @NotNull
    private Double available;

    @JsonProperty("credit")
    @NotNull
    private Double credit;
}
