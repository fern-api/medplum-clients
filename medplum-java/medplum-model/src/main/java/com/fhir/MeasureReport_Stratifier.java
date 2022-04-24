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
    as = ImmutableMeasureReport_Stratifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Stratifier {
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> code();

  Optional<List<MeasureReport_Stratum>> stratum();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMeasureReport_Stratifier.Builder builder() {
    return ImmutableMeasureReport_Stratifier.builder();
  }
}
