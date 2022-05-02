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
    as = ImmutableClaim.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim {
  Optional<List<Claim_Diagnosis>> diagnosis();

  Optional<List<Claim_SupportingInfo>> supportingInfo();

  Optional<Money> total();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Claim_Accident> accident();

  Optional<List<Claim_Item>> item();

  Optional<Period> billablePeriod();

  Optional<Claim_Payee> payee();

  Optional<Reference> prescription();

  List<Claim_Insurance> insurance();

  Reference provider();

  CodeableConcept priority();

  Optional<List<Claim_CareTeam>> careTeam();

  Optional<List<Identifier>> identifier();

  CodeableConcept type();

  Optional<ClaimUse> use();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Reference> originalPrescription();

  Reference patient();

  Optional<List<Extension>> extension();

  Optional<Reference> facility();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> referral();

  Optional<List<Claim_Procedure>> procedure();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Reference> insurer();

  Optional<Code> status();

  Optional<Id> id();

  Optional<DateTime> created();

  Optional<List<Claim_Related>> related();

  Optional<Reference> enterer();

  Optional<CodeableConcept> fundsReserve();

  Optional<CodeableConcept> subType();

  static ImmutableClaim.ResourceTypeBuildStage builder() {
    return ImmutableClaim.builder();
  }
}
