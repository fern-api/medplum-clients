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
    as = ImmutableMeasureReport_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Group {
  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<MeasureReport_Population>> population();

  Optional<List<MeasureReport_Stratifier>> stratifier();

  Optional<String> id();

  Optional<Quantity> measureScore();

  static ImmutableMeasureReport_Group.Builder builder() {
    return ImmutableMeasureReport_Group.builder();
  }
}
