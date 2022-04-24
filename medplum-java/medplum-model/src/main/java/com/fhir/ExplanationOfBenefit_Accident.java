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
    as = ImmutableExplanationOfBenefit_Accident.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Accident {
  Optional<Reference> locationReference();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<date> date();

  Optional<CodeableConcept> type();

  Optional<Address> locationAddress();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_Accident.Builder builder() {
    return ImmutableExplanationOfBenefit_Accident.builder();
  }
}
