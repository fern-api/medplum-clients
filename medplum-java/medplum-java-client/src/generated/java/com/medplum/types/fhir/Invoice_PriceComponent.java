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
    as = ImmutableInvoice_PriceComponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice_PriceComponent {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<Decimal> factor();

  Optional<Money> amount();

  Optional<Invoice_pricecomponentType> type();

  static ImmutableInvoice_PriceComponent.Builder builder() {
    return ImmutableInvoice_PriceComponent.builder();
  }
}
