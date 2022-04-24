package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<Range> valueRange();

  Optional<Boolean> valueBoolean();

  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  static ImmutableSupplyRequest_Parameter.Builder builder() {
    return ImmutableSupplyRequest_Parameter.builder();
  }
}
