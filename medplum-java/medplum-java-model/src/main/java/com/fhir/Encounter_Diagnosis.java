package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> use();

  Reference condition();

  Optional<positiveInt> rank();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableEncounter_Diagnosis.ConditionBuildStage builder() {
    return ImmutableEncounter_Diagnosis.builder();
  }
}
