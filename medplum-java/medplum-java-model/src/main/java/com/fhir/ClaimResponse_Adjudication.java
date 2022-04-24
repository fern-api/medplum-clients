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
    as = ImmutableClaimResponse_Adjudication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Adjudication {
  CodeableConcept category();

  Optional<CodeableConcept> reason();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<decimal> value();

  Optional<String> id();

  Optional<Money> amount();

  static ImmutableClaimResponse_Adjudication.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Adjudication.builder();
  }
}
