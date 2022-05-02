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
  Optional<Reference> originalPrescription();

  CodeableConcept type();

  Reference insurer();

  Optional<List<ExplanationOfBenefit_ProcessNote>> processNote();

  Optional<DateTime> created();

  Optional<List<ExplanationOfBenefit_Procedure>> procedure();

  Optional<Period> benefitPeriod();

  Reference provider();

  Optional<List<ExplanationOfBenefit_CareTeam>> careTeam();

  Optional<List<Identifier>> identifier();

  Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis();

  Optional<List<ExplanationOfBenefit_Item>> item();

  Optional<List<Extension>> modifierExtension();

  Optional<ExplanationOfBenefit_Payment> payment();

  Optional<List<Period>> preAuthRefPeriod();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<ExplanationOfBenefit_Related>> related();

  Optional<PositiveInt> precedence();

  Optional<Reference> facility();

  Optional<CodeableConcept> formCode();

  Optional<Period> billablePeriod();

  Optional<Id> id();

  Optional<List<String>> preAuthRef();

  Optional<List<ExplanationOfBenefit_AddItem>> addItem();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> fundsReserve();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<Code> language();

  String resourceType();

  Optional<ExplanationofbenefitStatus> status();

  Optional<ExplanationOfBenefit_Accident> accident();

  Optional<Code> outcome();

  List<ExplanationOfBenefit_Insurance> insurance();

  Optional<Code> use();

  Optional<Reference> enterer();

  Optional<Reference> prescription();

  Optional<Attachment> form();

  Optional<Reference> claimResponse();

  Optional<List<ResourceList>> contained();

  Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo();

  Optional<CodeableConcept> priority();

  Optional<Reference> claim();

  Optional<CodeableConcept> fundsReserveRequested();

  Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance();

  Optional<List<ExplanationOfBenefit_Total>> total();

  Optional<String> disposition();

  Optional<Narrative> text();

  Optional<CodeableConcept> subType();

  Reference patient();

  Optional<ExplanationOfBenefit_Payee> payee();

  Optional<Reference> referral();

  static ImmutableExplanationOfBenefit.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit.builder();
  }
}
