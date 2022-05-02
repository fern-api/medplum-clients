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
    as = ImmutableGroup_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group_Characteristic {
  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<Boolean> valueBoolean();

  Optional<Reference> valueReference();

  Optional<String> id();

  Optional<Range> valueRange();

  CodeableConcept code();

  Optional<Boolean> exclude();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> valueCodeableConcept();

  static ImmutableGroup_Characteristic.CodeBuildStage builder() {
    return ImmutableGroup_Characteristic.builder();
  }
}
