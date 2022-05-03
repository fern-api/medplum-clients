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
  Optional<Decimal> factor();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<Reference>> udi();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<CodeableConcept> bodySite();

  Optional<List<PositiveInt>> noteNumber();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> diagnosisSequence();

  Optional<Money> net();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> revenue();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> procedureSequence();

  Optional<List<CodeableConcept>> programCode();

  Optional<Reference> locationReference();

  Optional<List<PositiveInt>> informationSequence();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> category();

  Optional<List<Reference>> encounter();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> subSite();

  CodeableConcept productOrService();

  Optional<List<PositiveInt>> careTeamSequence();

  Optional<String> servicedDate();

  Optional<List<ExplanationOfBenefit_Detail>> detail();

  Optional<Period> servicedPeriod();

  Optional<List<CodeableConcept>> modifier();

  Optional<Address> locationAddress();

  static ImmutableExplanationOfBenefit_Item.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Item.builder();
  }
}
