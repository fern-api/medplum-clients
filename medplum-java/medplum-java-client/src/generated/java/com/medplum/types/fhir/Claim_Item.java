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
  Optional<CodeableConcept> bodySite();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<Period> servicedPeriod();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> modifier();

  Optional<Reference> locationReference();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> programCode();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> revenue();

  Optional<Money> net();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<List<Reference>> udi();

  Optional<List<Extension>> extension();

  CodeableConcept productOrService();

  Optional<String> id();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<Reference>> encounter();

  Optional<String> servicedDate();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<Claim_Detail>> detail();

  Optional<Address> locationAddress();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> subSite();

  Optional<Decimal> factor();

  static ImmutableClaim_Item.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Item.builder();
  }
}
