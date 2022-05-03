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
    as = ImmutableSpecimenDefinition_Handling.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SpecimenDefinition_Handling {
  Optional<Duration> maxDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> temperatureRange();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> temperatureQualifier();

  Optional<String> instruction();

  static ImmutableSpecimenDefinition_Handling.Builder builder() {
    return ImmutableSpecimenDefinition_Handling.builder();
  }
}
