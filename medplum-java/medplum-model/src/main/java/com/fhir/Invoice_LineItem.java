package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableInvoice_LineItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice_LineItem {
  Optional<List<Extension>> extension();

  Optional<Reference> chargeItemReference();

  Optional<List<Invoice_PriceComponent>> priceComponent();

  Optional<CodeableConcept> chargeItemCodeableConcept();

  Optional<String> id();

  Optional<positiveInt> sequence();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInvoice_LineItem.Builder builder() {
    return ImmutableInvoice_LineItem.builder();
  }
}
