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
    as = ImmutableMeasureReport_Stratifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Stratifier {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<MeasureReport_Stratum>> stratum();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> extension();

  static ImmutableMeasureReport_Stratifier.Builder builder() {
    return ImmutableMeasureReport_Stratifier.builder();
  }
}
