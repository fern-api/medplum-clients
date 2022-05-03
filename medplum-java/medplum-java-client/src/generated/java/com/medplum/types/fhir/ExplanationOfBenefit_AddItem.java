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
  Optional<Quantity> quantity();

  Optional<List<ExplanationOfBenefit_Detail1>> detail();

  Optional<Decimal> factor();

  Optional<String> servicedDate();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<PositiveInt>> detailSequence();

  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<Reference>> provider();

  Optional<Period> servicedPeriod();

  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<CodeableConcept> bodySite();

  Optional<Address> locationAddress();

  Optional<String> id();

  Optional<List<CodeableConcept>> modifier();

  Optional<Reference> locationReference();

  Optional<List<PositiveInt>> subDetailSequence();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<PositiveInt>> itemSequence();

  Optional<CodeableConcept> locationCodeableConcept();

  static ImmutableExplanationOfBenefit_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_AddItem.builder();
  }
}
