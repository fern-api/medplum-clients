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
    as = ImmutableMeasureReport_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Group {
  Optional<String> id();

  Optional<Quantity> measureScore();

  Optional<CodeableConcept> code();

  Optional<List<MeasureReport_Population>> population();

  Optional<List<Extension>> modifierExtension();

  Optional<List<MeasureReport_Stratifier>> stratifier();

  Optional<List<Extension>> extension();

  static ImmutableMeasureReport_Group.Builder builder() {
    return ImmutableMeasureReport_Group.builder();
  }
}
