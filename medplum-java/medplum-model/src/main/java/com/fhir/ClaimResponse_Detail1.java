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
    as = ImmutableClaimResponse_Detail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Detail1 {
  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<List<ClaimResponse_SubDetail1>> subDetail();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<List<positiveInt>> noteNumber();

  CodeableConcept productOrService();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CodeableConcept>> modifier();

  Optional<decimal> factor();

  static ImmutableClaimResponse_Detail1.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_Detail1.builder();
  }
}
