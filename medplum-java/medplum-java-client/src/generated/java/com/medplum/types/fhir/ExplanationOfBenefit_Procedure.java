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
    as = ImmutableExplanationOfBenefit_Procedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Procedure {
  Optional<String> id();

  Optional<DateTime> date();

  Optional<List<CodeableConcept>> type();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> udi();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> procedureReference();

  Optional<PositiveInt> sequence();

  static ImmutableExplanationOfBenefit_Procedure.Builder builder() {
    return ImmutableExplanationOfBenefit_Procedure.builder();
  }
}
