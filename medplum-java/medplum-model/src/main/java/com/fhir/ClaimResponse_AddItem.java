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
    as = ImmutableClaimResponse_AddItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_AddItem {
  List<ClaimResponse_Adjudication> adjudication();

  Optional<decimal> factor();

  Optional<List<CodeableConcept>> subSite();

  Optional<Quantity> quantity();

  Optional<List<positiveInt>> subdetailSequence();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<List<Extension>> extension();

  CodeableConcept productOrService();

  Optional<Period> servicedPeriod();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<positiveInt>> itemSequence();

  Optional<Reference> locationReference();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<CodeableConcept> bodySite();

  Optional<String> servicedDate();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<positiveInt>> detailSequence();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<ClaimResponse_Detail1>> detail();

  Optional<List<Reference>> provider();

  Optional<Address> locationAddress();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaimResponse_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableClaimResponse_AddItem.builder();
  }
}
