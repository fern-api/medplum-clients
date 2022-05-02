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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Decimal> factor();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<String> servicedDate();

  Optional<List<ExplanationOfBenefit_Detail>> detail();

  Optional<List<PositiveInt>> informationSequence();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> net();

  Optional<CodeableConcept> bodySite();

  Optional<List<Reference>> encounter();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> modifier();

  Optional<Period> servicedPeriod();

  Optional<CodeableConcept> revenue();

  Optional<List<Reference>> udi();

  Optional<PositiveInt> sequence();

  Optional<List<PositiveInt>> careTeamSequence();

  CodeableConcept productOrService();

  Optional<Reference> locationReference();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> category();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<Address> locationAddress();

  static ImmutableExplanationOfBenefit_Item.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Item.builder();
  }
}
