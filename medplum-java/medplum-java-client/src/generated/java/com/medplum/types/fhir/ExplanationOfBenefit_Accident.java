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
    as = ImmutableExplanationOfBenefit_Accident.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Accident {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Date> date();

  Optional<Reference> locationReference();

  Optional<Address> locationAddress();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableExplanationOfBenefit_Accident.Builder builder() {
    return ImmutableExplanationOfBenefit_Accident.builder();
  }
}
