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
    as = ImmutableCondition_Stage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Condition_Stage {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> summary();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> assessment();

  static ImmutableCondition_Stage.Builder builder() {
    return ImmutableCondition_Stage.builder();
  }
}
