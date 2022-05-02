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
  CodeableConcept type();

  Optional<PositiveInt> precedence();

  Optional<Reference> facility();

  Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis();

  Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo();

  Reference insurer();

  Optional<Reference> prescription();

  Optional<Id> id();

  Optional<List<Period>> preAuthRefPeriod();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Reference patient();

  Optional<Attachment> form();

  Optional<DateTime> created();

  List<ExplanationOfBenefit_Insurance> insurance();

  Optional<List<ExplanationOfBenefit_AddItem>> addItem();

  Optional<Meta> meta();

  Optional<CodeableConcept> fundsReserveRequested();

  Optional<Narrative> text();

  Optional<List<ExplanationOfBenefit_Related>> related();

  Optional<List<ExplanationOfBenefit_Procedure>> procedure();

  Optional<List<ExplanationOfBenefit_CareTeam>> careTeam();

  Optional<List<Extension>> extension();

  Optional<String> disposition();

  Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance();

  Optional<CodeableConcept> formCode();

  Reference provider();

  Optional<Code> use();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<ResourceList>> contained();

  Optional<ExplanationOfBenefit_Payee> payee();

  Optional<List<ExplanationOfBenefit_Total>> total();

  Optional<Period> billablePeriod();

  Optional<CodeableConcept> subType();

  Optional<Reference> claimResponse();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> fundsReserve();

  Optional<Reference> referral();

  Optional<ExplanationOfBenefit_Payment> payment();

  Optional<Reference> originalPrescription();

  Optional<Reference> claim();

  Optional<Uri> implicitRules();

  Optional<Period> benefitPeriod();

  Optional<List<String>> preAuthRef();

  Optional<List<ExplanationOfBenefit_Item>> item();

  Optional<ExplanationofbenefitStatus> status();

  Optional<CodeableConcept> priority();

  Optional<ExplanationOfBenefit_Accident> accident();

  Optional<List<ExplanationOfBenefit_ProcessNote>> processNote();

  Optional<Code> language();

  Optional<Reference> enterer();

  Optional<Code> outcome();

  static ImmutableExplanationOfBenefit.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit.builder();
  }
}
