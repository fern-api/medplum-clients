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
    as = ImmutableChargeItemDefinition_PriceComponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItemDefinition_PriceComponent {
  Optional<CodeableConcept> code();

  Optional<Code> type();

  Optional<Money> amount();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> factor();

  Optional<String> id();

  static ImmutableChargeItemDefinition_PriceComponent.Builder builder() {
    return ImmutableChargeItemDefinition_PriceComponent.builder();
  }
}
