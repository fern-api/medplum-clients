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
  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<List<PositiveInt>> informationSequence();

  Optional<Money> net();

  Optional<Reference> locationReference();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> category();

  Optional<Decimal> factor();

  Optional<PositiveInt> sequence();

  Optional<Money> unitPrice();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> revenue();

  Optional<List<Reference>> encounter();

  CodeableConcept productOrService();

  Optional<Quantity> quantity();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<List<Claim_Detail>> detail();

  Optional<Period> servicedPeriod();

  Optional<Address> locationAddress();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Reference>> udi();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<String> servicedDate();

  static ImmutableClaim_Item.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Item.builder();
  }
}
