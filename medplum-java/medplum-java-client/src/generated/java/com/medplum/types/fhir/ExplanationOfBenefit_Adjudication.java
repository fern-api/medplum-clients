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
    as = ImmutableExplanationOfBenefit_Adjudication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Adjudication {
  Optional<Decimal> value();

  CodeableConcept category();

  Optional<CodeableConcept> reason();

  Optional<List<Extension>> extension();

  Optional<Money> amount();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_Adjudication.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_Adjudication.builder();
  }
}
