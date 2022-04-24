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
    as = ImmutableDevice_Specialization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_Specialization {
  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept systemType();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableDevice_Specialization.SystemTypeBuildStage builder() {
    return ImmutableDevice_Specialization.builder();
  }
}
