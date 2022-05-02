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
  List<ClaimResponse_Adjudication> adjudication();

  Optional<Money> unitPrice();

  Optional<Period> servicedPeriod();

  Optional<String> id();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<PositiveInt>> itemSequence();

  Optional<List<PositiveInt>> subdetailSequence();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<PositiveInt>> noteNumber();

  CodeableConcept productOrService();

  Optional<List<Reference>> provider();

  Optional<String> servicedDate();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> modifier();

  Optional<Decimal> factor();

  Optional<List<PositiveInt>> detailSequence();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<ClaimResponse_Detail1>> detail();

  Optional<CodeableConcept> bodySite();

  Optional<Quantity> quantity();

  Optional<Reference> locationReference();

  Optional<Money> net();

  Optional<Address> locationAddress();

  static ImmutableClaimResponse_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_AddItem.builder();
  }
}
