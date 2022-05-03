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
    as = ImmutableClaimResponse_AddItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_AddItem {
  Optional<Reference> locationReference();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ClaimResponse_Detail1>> detail();

  CodeableConcept productOrService();

  Optional<String> servicedDate();

  Optional<List<PositiveInt>> subdetailSequence();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<Address> locationAddress();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Decimal> factor();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<Period> servicedPeriod();

  Optional<List<Reference>> provider();

  Optional<List<CodeableConcept>> programCode();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<List<CodeableConcept>> subSite();

  Optional<CodeableConcept> bodySite();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<PositiveInt>> itemSequence();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> detailSequence();

  static ImmutableClaimResponse_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_AddItem.builder();
  }
}
