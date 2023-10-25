package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "DeliveryMessage")
@Builder
@Data
public class Delivery {

    @JsonProperty(value = "order_id")
    @NotNull
    private Integer orderId;

    @JsonProperty(value = "restaurant_id")
    @NotNull
    private Integer restaurantId;

    @JsonProperty
    private Integer courierId;

    @JsonProperty(value = "correlation_id")
    @NotNull
    private String correlationId;

    @JsonProperty(value = "submitted_at")
    @NotNull
    private LocalDateTime submittedAt;

    @JsonProperty(value = "address")
    @NotNull
    private String address;

    @JsonProperty(value = "delivery_time")
    private LocalDateTime deliveryTime;

    @JsonProperty(value = "delivered_at")
    @NotNull
    private LocalDateTime deliveredAt;

    @JsonProperty(value = "cost")
    private Double cost;
}
