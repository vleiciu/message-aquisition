package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@JsonRootName("ItemsUpdate")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsUpdate {

    @JsonProperty("items")
    @NotNull
    private List<Item> items;
}
