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
  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<PositiveInt>> itemSequence();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> servicedPeriod();

  Optional<List<Reference>> provider();

  Optional<List<ClaimResponse_Detail1>> detail();

  Optional<Reference> locationReference();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<List<CodeableConcept>> modifier();

  Optional<String> servicedDate();

  Optional<Address> locationAddress();

  Optional<Decimal> factor();

  Optional<List<PositiveInt>> detailSequence();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> subdetailSequence();

  Optional<Money> net();

  Optional<Quantity> quantity();

  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<CodeableConcept>> subSite();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> extension();

  static ImmutableClaimResponse_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_AddItem.builder();
  }
}
