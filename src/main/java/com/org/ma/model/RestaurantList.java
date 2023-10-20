package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Data
@JsonRootName(value = "RestaurantListRetrieve")
public class RestaurantList {

    @JsonProperty(value = "user_id")
    @NotNull
    private String userId;

    @JsonProperty(value = "correlation_id")
    @NotNull
    private String correlationId;

    @JsonProperty(value = "restaurants")
    @NotNull
    private List<RestaurantProperties> restaurants;
}
