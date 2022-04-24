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
    as = ImmutableCoverage_Exception.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage_Exception {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  static ImmutableCoverage_Exception.TypeBuildStage builder() {
    return ImmutableCoverage_Exception.builder();
  }
}
