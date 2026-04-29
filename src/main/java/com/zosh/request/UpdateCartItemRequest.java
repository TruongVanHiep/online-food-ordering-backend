package com.zosh.request;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
    Long cartItemId;
    int quantity;

}
