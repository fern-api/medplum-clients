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
  Optional<Code> language();

  Optional<Reference> insurer();

  String resourceType();

  Optional<Claim_Accident> accident();

  Optional<List<Claim_Item>> item();

  Reference patient();

  Optional<Reference> enterer();

  Optional<CodeableConcept> subType();

  Optional<Code> status();

  Optional<Reference> facility();

  Optional<Meta> meta();

  Optional<List<Claim_Related>> related();

  Optional<Claim_Payee> payee();

  Optional<Period> billablePeriod();

  Optional<List<ResourceList>> contained();

  Optional<Reference> prescription();

  Optional<Reference> referral();

  Reference provider();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<Reference> originalPrescription();

  Optional<List<Claim_SupportingInfo>> supportingInfo();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  CodeableConcept priority();

  Optional<DateTime> created();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<Claim_Procedure>> procedure();

  Optional<List<Claim_CareTeam>> careTeam();

  List<Claim_Insurance> insurance();

  Optional<ClaimUse> use();

  Optional<Money> total();

  Optional<Uri> implicitRules();

  Optional<List<Claim_Diagnosis>> diagnosis();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim.ResourceTypeBuildStage builder() {
    return ImmutableClaim.builder();
  }
}
