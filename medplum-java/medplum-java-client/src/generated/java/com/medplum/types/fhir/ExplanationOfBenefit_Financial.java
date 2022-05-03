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

  Optional<List<Extension>> modifierExtension();

  Optional<Double> usedUnsignedInt();

  CodeableConcept type();

  Optional<Money> allowedMoney();

  Optional<String> allowedString();

  Optional<Double> allowedUnsignedInt();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableExplanationOfBenefit_Financial.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit_Financial.builder();
  }
}
