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
  Optional<List<Reference>> detail();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CodeableConcept>> code();

  static ImmutableCondition_Evidence.Builder builder() {
    return ImmutableCondition_Evidence.builder();
  }
}
