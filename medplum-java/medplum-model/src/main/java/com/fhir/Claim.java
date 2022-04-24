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
    as = ImmutableClaim.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim {
  CodeableConcept priority();

  Optional<id> id();

  Optional<ClaimUse> use();

  Optional<Reference> originalPrescription();

  Optional<List<Claim_SupportingInfo>> supportingInfo();

  Optional<List<Claim_CareTeam>> careTeam();

  String resourceType();

  Optional<Meta> meta();

  Optional<Claim_Payee> payee();

  Optional<Reference> referral();

  Optional<Narrative> text();

  Optional<dateTime> created();

  Optional<Reference> facility();

  Optional<CodeableConcept> subType();

  Optional<Reference> prescription();

  Optional<uri> implicitRules();

  List<Claim_Insurance> insurance();

  Optional<Claim_Accident> accident();

  Optional<List<Claim_Related>> related();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<Identifier>> identifier();

  Optional<code> status();

  Optional<code> language();

  Optional<Money> total();

  Optional<Period> billablePeriod();

  Optional<List<ResourceList>> contained();

  Optional<List<Claim_Procedure>> procedure();

  Reference patient();

  Optional<Reference> enterer();

  Optional<List<Claim_Diagnosis>> diagnosis();

  Optional<Reference> insurer();

  Reference provider();

  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Claim_Item>> item();

  static ImmutableClaim.PriorityBuildStage builder() {
    return ImmutableClaim.builder();
  }
}
