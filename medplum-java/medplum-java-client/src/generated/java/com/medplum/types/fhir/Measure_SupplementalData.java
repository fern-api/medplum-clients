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
  Expression criteria();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> usage();

  static ImmutableMeasure_SupplementalData.CriteriaBuildStage builder() {
    return ImmutableMeasure_SupplementalData.builder();
  }
}
