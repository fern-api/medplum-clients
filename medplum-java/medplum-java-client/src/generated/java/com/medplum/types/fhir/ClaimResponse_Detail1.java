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
    as = ImmutableClaimResponse_Detail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Detail1 {
  Optional<List<ClaimResponse_SubDetail1>> subDetail();

  Optional<List<Extension>> extension();

  Optional<Money> net();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> unitPrice();

  List<ClaimResponse_Adjudication> adjudication();

  CodeableConcept productOrService();

  Optional<Decimal> factor();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<String> id();

  static ImmutableClaimResponse_Detail1.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_Detail1.builder();
  }
}
