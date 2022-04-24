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
    as = ImmutableExplanationOfBenefit_Procedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Procedure {
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<dateTime> date();

  Optional<Reference> procedureReference();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<positiveInt> sequence();

  Optional<List<Reference>> udi();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_Procedure.Builder builder() {
    return ImmutableExplanationOfBenefit_Procedure.builder();
  }
}
