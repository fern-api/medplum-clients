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
    as = ImmutableBiologicallyDerivedProduct_Processing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Processing {
  Optional<Period> timePeriod();

  Optional<String> description();

  Optional<CodeableConcept> procedure();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> additive();

  Optional<String> timeDateTime();

  static ImmutableBiologicallyDerivedProduct_Processing.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Processing.builder();
  }
}
