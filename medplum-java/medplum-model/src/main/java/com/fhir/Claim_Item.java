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
    as = ImmutableClaim_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Item {
  CodeableConcept productOrService();

  Optional<List<positiveInt>> procedureSequence();

  Optional<List<Extension>> modifierExtension();

  Optional<String> servicedDate();

  Optional<List<Reference>> udi();

  Optional<String> id();

  Optional<Reference> locationReference();

  Optional<List<positiveInt>> informationSequence();

  Optional<List<Reference>> encounter();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> unitPrice();

  Optional<Address> locationAddress();

  Optional<CodeableConcept> bodySite();

  Optional<CodeableConcept> revenue();

  Optional<positiveInt> sequence();

  Optional<List<CodeableConcept>> subSite();

  Optional<CodeableConcept> category();

  Optional<Period> servicedPeriod();

  Optional<List<Extension>> extension();

  Optional<Money> net();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<positiveInt>> careTeamSequence();

  Optional<Quantity> quantity();

  Optional<decimal> factor();

  Optional<List<positiveInt>> diagnosisSequence();

  Optional<List<Claim_Detail>> detail();

  static ImmutableClaim_Item.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Item.builder();
  }
}
