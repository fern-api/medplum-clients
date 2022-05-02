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
  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> value();

  Optional<String> id();

  Optional<String> name();

  Optional<List<Extension>> extension();

  static ImmutableCoverage_Class.TypeBuildStage builder() {
    return ImmutableCoverage_Class.builder();
  }
}
