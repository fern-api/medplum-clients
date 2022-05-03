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
    as = ImmutableExplanationOfBenefit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit {
  Optional<Id> id();

  Optional<List<ExplanationOfBenefit_ProcessNote>> processNote();

  Optional<Reference> facility();

  String resourceType();

  Optional<List<ExplanationOfBenefit_CareTeam>> careTeam();

  Reference patient();

  Optional<List<String>> preAuthRef();

  Optional<List<ExplanationOfBenefit_Procedure>> procedure();

  Optional<CodeableConcept> formCode();

  Optional<Reference> prescription();

  Optional<ExplanationOfBenefit_Payment> payment();

  Optional<String> disposition();

  Optional<List<Period>> preAuthRefPeriod();

  Optional<Meta> meta();

  Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis();

  Optional<Reference> originalPrescription();

  Optional<Period> benefitPeriod();

  Optional<Reference> claimResponse();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  List<ExplanationOfBenefit_Insurance> insurance();

  Optional<CodeableConcept> subType();

  Optional<Period> billablePeriod();

  Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo();

  Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance();

  Optional<ExplanationOfBenefit_Payee> payee();

  Optional<Attachment> form();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> fundsReserveRequested();

  Optional<Reference> enterer();

  Optional<Reference> referral();

  Optional<CodeableConcept> fundsReserve();

  Optional<Narrative> text();

  Optional<Reference> claim();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<ExplanationOfBenefit_Accident> accident();

  CodeableConcept type();

  Optional<Code> use();

  Optional<Code> outcome();

  Optional<DateTime> created();

  Reference insurer();

  Optional<List<ExplanationOfBenefit_Total>> total();

  Optional<List<ExplanationOfBenefit_Related>> related();

  Optional<CodeableConcept> priority();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExplanationOfBenefit_AddItem>> addItem();

  Optional<List<ResourceList>> contained();

  Optional<List<ExplanationOfBenefit_Item>> item();

  Reference provider();

  Optional<ExplanationofbenefitStatus> status();

  Optional<Code> language();

  Optional<PositiveInt> precedence();

  static ImmutableExplanationOfBenefit.ResourceTypeBuildStage builder() {
    return ImmutableExplanationOfBenefit.builder();
  }
}
