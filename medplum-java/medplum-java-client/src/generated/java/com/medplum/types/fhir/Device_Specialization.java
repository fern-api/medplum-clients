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
    as = ImmutableDevice_Specialization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_Specialization {
  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept systemType();

  static ImmutableDevice_Specialization.SystemTypeBuildStage builder() {
    return ImmutableDevice_Specialization.builder();
  }
}