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
    as = ImmutableEncounter_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Encounter_Diagnosis {
  Reference condition();

  Optional<PositiveInt> rank();

  Optional<String> id();

  Optional<CodeableConcept> use();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEncounter_Diagnosis.ConditionBuildStage builder() {
    return ImmutableEncounter_Diagnosis.builder();
  }
}
