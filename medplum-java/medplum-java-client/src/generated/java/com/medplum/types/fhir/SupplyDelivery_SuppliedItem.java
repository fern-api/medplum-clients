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
    as = ImmutableSupplyDelivery_SuppliedItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyDelivery_SuppliedItem {
  Optional<Reference> itemReference();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableSupplyDelivery_SuppliedItem.Builder builder() {
    return ImmutableSupplyDelivery_SuppliedItem.builder();
  }
}
