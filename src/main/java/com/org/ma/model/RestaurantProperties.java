package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "RestaurantProperties")
public class RestaurantProperties {

    @JsonProperty("restaurant_id")
    @NotNull
    private String restaurantId;

    @JsonProperty("restaurant_name")
    @NotNull
    private String restaurantName;

    @JsonProperty("address")
    private String address;

    @JsonProperty("is_active")
    @NotNull
    private Boolean isActive;
}
