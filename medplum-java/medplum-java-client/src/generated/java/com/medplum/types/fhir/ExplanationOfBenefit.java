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
  Optional<Period> billablePeriod();

  Optional<ExplanationOfBenefit_Payment> payment();

  Optional<List<String>> preAuthRef();

  Optional<ExplanationOfBenefit_Payee> payee();

  Optional<Reference> enterer();

  Optional<CodeableConcept> fundsReserve();

  CodeableConcept type();

  Reference provider();

  List<ExplanationOfBenefit_Insurance> insurance();

  Optional<Period> benefitPeriod();

  Optional<PositiveInt> precedence();

  Optional<List<ExplanationOfBenefit_AddItem>> addItem();

  Optional<List<ExplanationOfBenefit_Total>> total();

  Optional<Code> use();

  Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo();

  Optional<List<ExplanationOfBenefit_ProcessNote>> processNote();

  Optional<Reference> claimResponse();

  Optional<Narrative> text();

  Optional<List<ExplanationOfBenefit_Item>> item();

  Optional<Reference> prescription();

  Optional<Reference> referral();

  Optional<String> disposition();

  Reference insurer();

  Optional<Reference> facility();

  Optional<CodeableConcept> subType();

  Optional<Reference> claim();

  Optional<List<ExplanationOfBenefit_Procedure>> procedure();

  Optional<Code> outcome();

  Optional<List<Extension>> extension();

  Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance();

  Optional<Id> id();

  String resourceType();

  Optional<List<ExplanationOfBenefit_Related>> related();

  Optional<Code> language();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<Identifier>> identifier();

  Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis();

  Optional<CodeableConcept> fundsReserveRequested();

  Optional<CodeableConcept> formCode();

  Optional<Meta> meta();

  Optional<ExplanationOfBenefit_Accident> accident();

  Optional<Uri> implicitRules();

  Reference patient();

  Optional<ExplanationofbenefitStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExplanationOfBenefit_CareTeam>> careTeam();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> created();

  Optional<List<Period>> preAuthRefPeriod();

  Optional<Reference> originalPrescription();

  Optional<CodeableConcept> priority();

  Optional<Attachment> form();

  static ImmutableExplanationOfBenefit.TypeBuildStage builder() {
    return ImmutableExplanationOfBenefit.builder();
  }
}
