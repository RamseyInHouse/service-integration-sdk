package com.appdirect.sdk.vendorFields.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VendorFieldsValidationRequest {
    private String partner;
    private String editionCode;
    private FlowType flowType;
    private OperationType operationType;
    private String ApplicationIdentifier;
    private Map<String, String> fieldValues;
}
