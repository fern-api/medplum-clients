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
    as = ImmutableExplanationOfBenefit_Payee.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Payee {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> party();

  static ImmutableExplanationOfBenefit_Payee.Builder builder() {
    return ImmutableExplanationOfBenefit_Payee.builder();
  }
}
