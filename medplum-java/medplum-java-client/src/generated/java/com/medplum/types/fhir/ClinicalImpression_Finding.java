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
    as = ImmutableClinicalImpression_Finding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClinicalImpression_Finding {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Reference> itemReference();

  Optional<String> basis();

  static ImmutableClinicalImpression_Finding.Builder builder() {
    return ImmutableClinicalImpression_Finding.builder();
  }
}
