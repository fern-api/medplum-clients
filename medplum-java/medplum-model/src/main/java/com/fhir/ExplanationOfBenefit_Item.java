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
    as = ImmutableExplanationOfBenefit_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Item {
  CodeableConcept productOrService();

  Optional<Period> servicedPeriod();

  Optional<CodeableConcept> bodySite();

  Optional<List<Reference>> encounter();

  Optional<String> id();

  Optional<List<positiveInt>> procedureSequence();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<positiveInt>> informationSequence();

  Optional<String> servicedDate();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<CodeableConcept>> modifier();

  Optional<Address> locationAddress();

  Optional<List<positiveInt>> careTeamSequence();

  Optional<decimal> factor();

  Optional<Reference> locationReference();

  Optional<List<positiveInt>> diagnosisSequence();

  Optional<CodeableConcept> revenue();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<ExplanationOfBenefit_Detail>> detail();

  Optional<Money> net();

  Optional<CodeableConcept> category();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<Money> unitPrice();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  Optional<positiveInt> sequence();

  Optional<List<Reference>> udi();

  static ImmutableExplanationOfBenefit_Item.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Item.builder();
  }
}
