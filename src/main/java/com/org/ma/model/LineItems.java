package com.org.ma.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "line_items")
public class LineItems {

    @JsonProperty(value = "item")
    private Item item;

    @JsonProperty(value = "quantity")
    private Integer quantity;
}
