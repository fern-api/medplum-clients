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
  Optional<List<ClaimResponse_Detail1>> detail();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> net();

  Optional<List<Reference>> provider();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<PositiveInt>> detailSequence();

  Optional<List<Extension>> modifierExtension();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<Decimal> factor();

  Optional<String> servicedDate();

  Optional<List<CodeableConcept>> subSite();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<Period> servicedPeriod();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<List<CodeableConcept>> modifier();

  Optional<Address> locationAddress();

  Optional<Reference> locationReference();

  CodeableConcept productOrService();

  Optional<List<PositiveInt>> itemSequence();

  Optional<List<PositiveInt>> subdetailSequence();

  Optional<CodeableConcept> bodySite();

  static ImmutableClaimResponse_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_AddItem.builder();
  }
}
