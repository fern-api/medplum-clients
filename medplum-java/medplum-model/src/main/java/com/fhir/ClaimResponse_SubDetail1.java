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
    as = ImmutableClaimResponse_SubDetail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_SubDetail1 {
  Optional<List<CodeableConcept>> modifier();

  CodeableConcept productOrService();

  Optional<Quantity> quantity();

  Optional<decimal> factor();

  Optional<String> id();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<List<Extension>> modifierExtension();

  Optional<List<positiveInt>> noteNumber();

  static ImmutableClaimResponse_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_SubDetail1.builder();
  }
}
