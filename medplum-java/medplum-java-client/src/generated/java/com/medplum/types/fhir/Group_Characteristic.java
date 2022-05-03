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
  Optional<Boolean> valueBoolean();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  Optional<Boolean> exclude();

  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Quantity> valueQuantity();

  Optional<Range> valueRange();

  static ImmutableGroup_Characteristic.CodeBuildStage builder() {
    return ImmutableGroup_Characteristic.builder();
  }
}
