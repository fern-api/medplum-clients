package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<String>> preAuthRef();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Boolean> focal();

  Optional<List<Extension>> extension();

  Reference coverage();

  static ImmutableExplanationOfBenefit_Insurance.CoverageBuildStage builder() {
    return ImmutableExplanationOfBenefit_Insurance.builder();
  }
}
