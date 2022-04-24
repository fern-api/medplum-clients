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
    as = ImmutableSupplyDelivery_SuppliedItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyDelivery_SuppliedItem {
  Optional<Reference> itemReference();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSupplyDelivery_SuppliedItem.Builder builder() {
    return ImmutableSupplyDelivery_SuppliedItem.builder();
  }
}
