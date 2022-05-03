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
    as = ImmutableCondition_Stage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Condition_Stage {
  Optional<List<Reference>> assessment();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> summary();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCondition_Stage.Builder builder() {
    return ImmutableCondition_Stage.builder();
  }
}
