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
    as = ImmutableCoverage_Class.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage_Class {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> value();

  Optional<List<Extension>> extension();

  Optional<String> name();

  CodeableConcept type();

  static ImmutableCoverage_Class.TypeBuildStage builder() {
    return ImmutableCoverage_Class.builder();
  }
}
