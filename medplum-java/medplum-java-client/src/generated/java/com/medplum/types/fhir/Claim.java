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
  CodeableConcept type();

  Optional<List<Claim_CareTeam>> careTeam();

  Optional<List<Claim_Procedure>> procedure();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Claim_SupportingInfo>> supportingInfo();

  Optional<Money> total();

  Optional<Id> id();

  Optional<DateTime> created();

  Optional<Period> billablePeriod();

  Optional<List<Claim_Diagnosis>> diagnosis();

  String resourceType();

  CodeableConcept priority();

  Optional<Claim_Payee> payee();

  Optional<Claim_Accident> accident();

  Optional<Reference> referral();

  Optional<Narrative> text();

  Optional<ClaimUse> use();

  Reference patient();

  List<Claim_Insurance> insurance();

  Optional<Uri> implicitRules();

  Optional<Reference> insurer();

  Optional<Reference> originalPrescription();

  Optional<Code> language();

  Optional<CodeableConcept> subType();

  Optional<List<Claim_Related>> related();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> facility();

  Optional<Reference> prescription();

  Optional<Meta> meta();

  Optional<Reference> enterer();

  Optional<Code> status();

  Reference provider();

  Optional<List<Claim_Item>> item();

  static ImmutableClaim.TypeBuildStage builder() {
    return ImmutableClaim.builder();
  }
}
