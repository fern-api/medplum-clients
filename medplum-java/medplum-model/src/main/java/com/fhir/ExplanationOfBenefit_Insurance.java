package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExplanationOfBenefit_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Insurance {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> focal();

  Reference coverage();

  Optional<List<String>> preAuthRef();

  Optional<String> id();

  static ImmutableExplanationOfBenefit_Insurance.CoverageBuildStage builder() {
    return ImmutableExplanationOfBenefit_Insurance.builder();
  }
}
