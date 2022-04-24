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
    as = ImmutableExplanationOfBenefit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit {
  Optional<id> id();

  Optional<List<Period>> preAuthRefPeriod();

  Optional<code> use();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> fundsReserve();

  Optional<code> language();

  Optional<List<ExplanationOfBenefit_Total>> total();

  Optional<Reference> originalPrescription();

  Optional<Reference> claim();

  List<ExplanationOfBenefit_Insurance> insurance();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> created();

  Reference insurer();

  Optional<Period> benefitPeriod();

  Optional<code> outcome();

  Optional<List<ExplanationOfBenefit_CareTeam>> careTeam();

  Optional<List<ExplanationOfBenefit_ProcessNote>> processNote();

  Optional<positiveInt> precedence();

  Optional<List<ExplanationOfBenefit_Item>> item();

  Optional<Reference> claimResponse();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<ExplanationOfBenefit_SupportingInfo>> supportingInfo();

  Optional<List<ExplanationOfBenefit_Procedure>> procedure();

  CodeableConcept type();

  Optional<Reference> enterer();

  String resourceType();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<ExplanationOfBenefit_Related>> related();

  Optional<Reference> facility();

  Optional<Period> billablePeriod();

  Optional<Narrative> text();

  Optional<CodeableConcept> formCode();

  Reference provider();

  Optional<Reference> prescription();

  Optional<ExplanationofbenefitStatus> status();

  Optional<CodeableConcept> priority();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> subType();

  Optional<CodeableConcept> fundsReserveRequested();

  Optional<Attachment> form();

  Optional<List<ExplanationOfBenefit_AddItem>> addItem();

  Optional<ExplanationOfBenefit_Payment> payment();

  Optional<List<ExplanationOfBenefit_Diagnosis>> diagnosis();

  Reference patient();

  Optional<String> disposition();

  Optional<List<ExplanationOfBenefit_BenefitBalance>> benefitBalance();

  Optional<List<Extension>> extension();

  Optional<List<String>> preAuthRef();

  Optional<ExplanationOfBenefit_Payee> payee();

  Optional<Reference> referral();

  Optional<ExplanationOfBenefit_Accident> accident();

  static ImmutableExplanationOfBenefit.InsurerBuildStage builder() {
    return ImmutableExplanationOfBenefit.builder();
  }
}
