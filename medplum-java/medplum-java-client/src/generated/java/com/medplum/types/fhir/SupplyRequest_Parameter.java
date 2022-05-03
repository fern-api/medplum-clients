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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  Optional<Boolean> valueBoolean();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Range> valueRange();

  Optional<Quantity> valueQuantity();

  static ImmutableSupplyRequest_Parameter.Builder builder() {
    return ImmutableSupplyRequest_Parameter.builder();
  }
}
