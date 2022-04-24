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
    as = ImmutableGroup_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group_Characteristic {
  Optional<List<Extension>> modifierExtension();

  Optional<Range> valueRange();

  Optional<Boolean> valueBoolean();

  Optional<Quantity> valueQuantity();

  CodeableConcept code();

  Optional<Boolean> exclude();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Reference> valueReference();

  Optional<Period> period();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableGroup_Characteristic.CodeBuildStage builder() {
    return ImmutableGroup_Characteristic.builder();
  }
}
