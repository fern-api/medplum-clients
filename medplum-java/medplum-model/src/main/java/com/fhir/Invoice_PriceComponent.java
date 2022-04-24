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
    as = ImmutableInvoice_PriceComponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice_PriceComponent {
  Optional<List<Extension>> modifierExtension();

  Optional<Invoice_pricecomponentType> type();

  Optional<Money> amount();

  Optional<decimal> factor();

  Optional<CodeableConcept> code();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableInvoice_PriceComponent.Builder builder() {
    return ImmutableInvoice_PriceComponent.builder();
  }
}
