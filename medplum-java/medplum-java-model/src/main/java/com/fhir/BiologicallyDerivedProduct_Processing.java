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
    as = ImmutableBiologicallyDerivedProduct_Processing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BiologicallyDerivedProduct_Processing {
  Optional<CodeableConcept> procedure();

  Optional<List<Extension>> modifierExtension();

  Optional<String> timeDateTime();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Period> timePeriod();

  Optional<String> description();

  Optional<Reference> additive();

  static ImmutableBiologicallyDerivedProduct_Processing.Builder builder() {
    return ImmutableBiologicallyDerivedProduct_Processing.builder();
  }
}
