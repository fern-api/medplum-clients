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
  CodeableConcept productOrService();

  Optional<Address> locationAddress();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<Money> unitPrice();

  Optional<List<Reference>> udi();

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> revenue();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Money> net();

  Optional<String> servicedDate();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Period> servicedPeriod();

  Optional<List<Reference>> encounter();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<ExplanationOfBenefit_Detail>> detail();

  Optional<Quantity> quantity();

  Optional<Decimal> factor();

  Optional<CodeableConcept> bodySite();

  Optional<String> id();

  Optional<Reference> locationReference();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> programCode();

  static ImmutableExplanationOfBenefit_Item.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Item.builder();
  }
}
