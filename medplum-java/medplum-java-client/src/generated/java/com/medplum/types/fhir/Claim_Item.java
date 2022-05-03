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
  Optional<List<CodeableConcept>> programCode();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> bodySite();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<CodeableConcept> category();

  Optional<Money> unitPrice();

  Optional<Reference> locationReference();

  Optional<List<Reference>> encounter();

  Optional<String> servicedDate();

  Optional<CodeableConcept> revenue();

  Optional<Money> net();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<Claim_Detail>> detail();

  Optional<Period> servicedPeriod();

  Optional<Quantity> quantity();

  Optional<String> id();

  Optional<List<PositiveInt>> procedureSequence();

  CodeableConcept productOrService();

  Optional<List<Reference>> udi();

  Optional<PositiveInt> sequence();

  Optional<Decimal> factor();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<Address> locationAddress();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<CodeableConcept>> subSite();

  static ImmutableClaim_Item.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Item.builder();
  }
}
