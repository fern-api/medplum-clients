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
    as = ImmutableExplanationOfBenefit_AddItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_AddItem {
  Optional<Address> locationAddress();

  Optional<List<ExplanationOfBenefit_Detail1>> detail();

  Optional<List<Reference>> provider();

  Optional<Money> net();

  CodeableConcept productOrService();

  Optional<String> servicedDate();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<Extension>> modifierExtension();

  Optional<List<positiveInt>> itemSequence();

  Optional<Period> servicedPeriod();

  Optional<List<CodeableConcept>> subSite();

  Optional<Reference> locationReference();

  Optional<decimal> factor();

  Optional<List<positiveInt>> detailSequence();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<List<CodeableConcept>> programCode();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> bodySite();

  Optional<String> id();

  Optional<List<positiveInt>> subDetailSequence();

  static ImmutableExplanationOfBenefit_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_AddItem.builder();
  }
}
