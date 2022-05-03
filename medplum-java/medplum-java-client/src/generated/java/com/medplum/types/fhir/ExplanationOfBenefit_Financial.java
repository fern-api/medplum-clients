package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExplanationOfBenefit_Financial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Financial {
  Optional<Money> usedMoney();

  Optional<String> allowedString();

  Optional<Double> allowedUnsignedInt();

  Optional<String> id();

  Optional<Double> usedUnsignedInt();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<Money> allowedMoney();

  static ImmutableExplanationOfBenefit_Financial.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit_Financial.builder();
  }
}
