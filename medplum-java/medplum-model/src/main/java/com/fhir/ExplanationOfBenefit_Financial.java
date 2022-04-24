package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Money> allowedMoney();

  Optional<Double> usedUnsignedInt();

  Optional<String> allowedString();

  Optional<Double> allowedUnsignedInt();

  CodeableConcept type();

  static ImmutableExplanationOfBenefit_Financial.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit_Financial.builder();
  }
}
