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
  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> valueBoolean();

  Optional<String> id();

  Optional<Quantity> valueQuantity();

  Optional<CodeableConcept> code();

  Optional<Range> valueRange();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> valueCodeableConcept();

  static ImmutableSupplyRequest_Parameter.Builder builder() {
    return ImmutableSupplyRequest_Parameter.builder();
  }
}
