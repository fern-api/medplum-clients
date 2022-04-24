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
    as = ImmutableExplanationOfBenefit_ProcessNote.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_ProcessNote {
  Optional<Explanationofbenefit_processnoteType> type();

  Optional<List<Extension>> modifierExtension();

  Optional<positiveInt> number();

  Optional<String> id();

  Optional<String> text();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> language();

  static ImmutableExplanationOfBenefit_ProcessNote.Builder builder() {
    return ImmutableExplanationOfBenefit_ProcessNote.builder();
  }
}
