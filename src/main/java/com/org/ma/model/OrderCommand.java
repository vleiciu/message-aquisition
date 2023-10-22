package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("OrderCommand")
public class OrderCommand {

    @JsonProperty("restaurant_id")
    @NotNull
    private Integer restaurantId;

    @JsonProperty("correlation_id")
    @NotNull
    private String correlationId;

    @JsonProperty("placed_at")
    @NotNull
    private LocalDateTime placedAt;

    @JsonProperty("items_list")
    private List<LineItems> itemsList;
}
