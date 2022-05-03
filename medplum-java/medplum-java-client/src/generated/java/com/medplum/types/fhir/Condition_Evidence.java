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
    as = ImmutableCondition_Evidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Condition_Evidence {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> code();

  Optional<List<Reference>> detail();

  static ImmutableCondition_Evidence.Builder builder() {
    return ImmutableCondition_Evidence.builder();
  }
}
