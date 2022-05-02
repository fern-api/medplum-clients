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
    as = ImmutableMeasureReport_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Component {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  CodeableConcept value();

  static ImmutableMeasureReport_Component.CodeBuildStage builder() {
    return ImmutableMeasureReport_Component.builder();
  }
}
