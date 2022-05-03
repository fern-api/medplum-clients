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
  Optional<String> id();

  Optional<Boolean> valueBoolean();

  Optional<Boolean> exclude();

  Optional<Range> valueRange();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<Period> period();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Quantity> valueQuantity();

  static ImmutableGroup_Characteristic.CodeBuildStage builder() {
    return ImmutableGroup_Characteristic.builder();
  }
}
