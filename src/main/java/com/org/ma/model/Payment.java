package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@JsonRootName("PaymentMessage")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment {

    @JsonProperty("transaction_id")
    @NotNull
    private String transactionId;

    @JsonProperty("sender_id")
    @NotNull
    private String senderId;

    @JsonProperty("receiver_id")
    @NotNull
    private String receiverId;

    @JsonProperty("correlation_id")
    @NotNull
    private String correlationId;

    @JsonProperty("amount")
    @NotNull
    private Double amount;

    @JsonProperty("requested_at")
    @NotNull
    private LocalDateTime requestedAt;
}
