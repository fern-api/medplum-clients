package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> chargeItemCodeableConcept();

  Optional<PositiveInt> sequence();

  Optional<List<Invoice_PriceComponent>> priceComponent();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> chargeItemReference();

  static ImmutableInvoice_LineItem.Builder builder() {
    return ImmutableInvoice_LineItem.builder();
  }
}
