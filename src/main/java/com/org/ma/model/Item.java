package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonRootName("Item")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    @JsonProperty(value = "item_id")
    @NotNull
    private Integer itemId;

    @JsonProperty(value = "item_name")
    @NotNull
    private String itemName;

    @JsonProperty(value = "price")
    @NotNull
    private Double price;

    @JsonProperty(value = "restaurant_id")
    private Integer restaurantId;
}
