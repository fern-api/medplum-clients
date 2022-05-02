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
    as = ImmutableClaim_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Item {
  Optional<Period> servicedPeriod();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<Quantity> quantity();

  Optional<Money> unitPrice();

  Optional<CodeableConcept> revenue();

  Optional<List<Reference>> encounter();

  Optional<List<CodeableConcept>> programCode();

  Optional<String> servicedDate();

  Optional<Address> locationAddress();

  Optional<Money> net();

  Optional<CodeableConcept> bodySite();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<String> id();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Claim_Detail>> detail();

  Optional<List<Reference>> udi();

  Optional<Decimal> factor();

  Optional<List<CodeableConcept>> subSite();

  CodeableConcept productOrService();

  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> sequence();

  Optional<Reference> locationReference();

  static ImmutableClaim_Item.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Item.builder();
  }
}
