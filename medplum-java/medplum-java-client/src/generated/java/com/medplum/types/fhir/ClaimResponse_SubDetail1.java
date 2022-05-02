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
    as = ImmutableClaimResponse_SubDetail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_SubDetail1 {
  Optional<Decimal> factor();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> modifierExtension();

  List<ClaimResponse_Adjudication> adjudication();

  CodeableConcept productOrService();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Quantity> quantity();

  static ImmutableClaimResponse_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_SubDetail1.builder();
  }
}
