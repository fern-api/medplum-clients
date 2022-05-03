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
    as = ImmutableExplanationOfBenefit_AddItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_AddItem {
  Optional<List<PositiveInt>> itemSequence();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<Money> net();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> subDetailSequence();

  Optional<List<CodeableConcept>> subSite();

  Optional<Address> locationAddress();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<CodeableConcept>> modifier();

  Optional<Quantity> quantity();

  CodeableConcept productOrService();

  Optional<List<ExplanationOfBenefit_Detail1>> detail();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<Reference> locationReference();

  Optional<Decimal> factor();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> detailSequence();

  Optional<List<Reference>> provider();

  Optional<Period> servicedPeriod();

  Optional<String> servicedDate();

  Optional<CodeableConcept> bodySite();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_AddItem.builder();
  }
}
