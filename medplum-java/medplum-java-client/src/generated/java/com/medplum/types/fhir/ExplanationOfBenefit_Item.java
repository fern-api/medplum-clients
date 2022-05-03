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
    as = ImmutableExplanationOfBenefit_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Item {
  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> revenue();

  Optional<List<ExplanationOfBenefit_Detail>> detail();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<Reference>> encounter();

  Optional<Reference> locationReference();

  Optional<Address> locationAddress();

  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<String> id();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> bodySite();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<CodeableConcept>> programCode();

  Optional<Period> servicedPeriod();

  Optional<CodeableConcept> category();

  Optional<Decimal> factor();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<Quantity> quantity();

  Optional<String> servicedDate();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> udi();

  CodeableConcept productOrService();

  static ImmutableExplanationOfBenefit_Item.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Item.builder();
  }
}
