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
    as = ImmutableMeasure_SupplementalData.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Measure_SupplementalData {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Expression criteria();

  Optional<String> id();

  Optional<List<CodeableConcept>> usage();

  Optional<String> description();

  Optional<CodeableConcept> code();

  static ImmutableMeasure_SupplementalData.CriteriaBuildStage builder() {
    return ImmutableMeasure_SupplementalData.builder();
  }
}
