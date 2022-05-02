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
    as = ImmutableCoverage_Exception.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage_Exception {
  CodeableConcept type();

  Optional<Period> period();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCoverage_Exception.TypeBuildStage builder() {
    return ImmutableCoverage_Exception.builder();
  }
}
