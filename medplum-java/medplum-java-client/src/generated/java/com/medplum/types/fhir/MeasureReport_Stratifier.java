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
  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<MeasureReport_Stratum>> stratum();

  Optional<String> id();

  static ImmutableMeasureReport_Stratifier.Builder builder() {
    return ImmutableMeasureReport_Stratifier.builder();
  }
}
