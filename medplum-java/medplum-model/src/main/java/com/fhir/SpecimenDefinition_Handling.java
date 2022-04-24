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
    as = ImmutableSpecimenDefinition_Handling.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_Handling {
  Optional<String> instruction();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Range> temperatureRange();

  Optional<String> id();

  Optional<Duration> maxDuration();

  Optional<CodeableConcept> temperatureQualifier();

  static ImmutableSpecimenDefinition_Handling.Builder builder() {
    return ImmutableSpecimenDefinition_Handling.builder();
  }
}
