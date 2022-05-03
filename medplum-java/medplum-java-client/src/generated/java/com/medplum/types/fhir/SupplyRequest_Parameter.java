package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSupplyRequest_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SupplyRequest_Parameter {
  Optional<CodeableConcept> code();

  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Boolean> valueBoolean();

  Optional<Range> valueRange();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableSupplyRequest_Parameter.Builder builder() {
    return ImmutableSupplyRequest_Parameter.builder();
  }
}
