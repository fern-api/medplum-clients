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
    as = ImmutableExplanationOfBenefit_ProcessNote.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_ProcessNote {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<PositiveInt> number();

  Optional<CodeableConcept> language();

  Optional<List<Extension>> extension();

  Optional<Explanationofbenefit_processnoteType> type();

  Optional<String> text();

  static ImmutableExplanationOfBenefit_ProcessNote.Builder builder() {
    return ImmutableExplanationOfBenefit_ProcessNote.builder();
  }
}
