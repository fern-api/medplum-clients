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
    as = ImmutableMeasureReport_Stratum.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MeasureReport_Stratum {
  Optional<CodeableConcept> value();

  Optional<String> id();

  Optional<Quantity> measureScore();

  Optional<List<Extension>> extension();

  Optional<List<MeasureReport_Component>> component();

  Optional<List<MeasureReport_Population1>> population();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMeasureReport_Stratum.Builder builder() {
    return ImmutableMeasureReport_Stratum.builder();
  }
}
