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
  Optional<Reference> facility();

  Optional<Narrative> text();

  Optional<List<Claim_Procedure>> procedure();

  Optional<Claim_Accident> accident();

  Optional<List<Claim_Item>> item();

  CodeableConcept type();

  Reference provider();

  Optional<List<Claim_SupportingInfo>> supportingInfo();

  Optional<Money> total();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<Claim_Diagnosis>> diagnosis();

  Optional<Reference> insurer();

  Optional<List<Extension>> extension();

  Optional<Period> billablePeriod();

  Optional<List<Identifier>> identifier();

  Optional<Reference> referral();

  Optional<ClaimUse> use();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Reference> prescription();

  Optional<CodeableConcept> subType();

  Reference patient();

  CodeableConcept priority();

  Optional<Meta> meta();

  Optional<Reference> originalPrescription();

  Optional<Claim_Payee> payee();

  Optional<Code> status();

  Optional<Reference> enterer();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> created();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Claim_Related>> related();

  List<Claim_Insurance> insurance();

  Optional<List<Claim_CareTeam>> careTeam();

  static ImmutableClaim.TypeBuildStage builder() {
    return ImmutableClaim.builder();
  }
}
