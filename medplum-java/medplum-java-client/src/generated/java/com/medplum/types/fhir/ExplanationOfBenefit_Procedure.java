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
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> procedureReference();

  Optional<List<Extension>> extension();

  Optional<DateTime> date();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<List<Reference>> udi();

  Optional<String> id();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> type();

  static ImmutableExplanationOfBenefit_Procedure.Builder builder() {
    return ImmutableExplanationOfBenefit_Procedure.builder();
  }
}
