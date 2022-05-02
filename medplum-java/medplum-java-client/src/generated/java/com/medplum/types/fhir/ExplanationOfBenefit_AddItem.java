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
  Optional<Address> locationAddress();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<CodeableConcept> bodySite();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<ExplanationOfBenefit_Detail1>> detail();

  CodeableConcept productOrService();

  Optional<Money> net();

  Optional<Decimal> factor();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<PositiveInt>> subDetailSequence();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> provider();

  Optional<Money> unitPrice();

  Optional<Reference> locationReference();

  Optional<List<PositiveInt>> detailSequence();

  Optional<Period> servicedPeriod();

  Optional<String> id();

  Optional<CodeableConcept> locationCodeableConcept();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PositiveInt>> itemSequence();

  Optional<String> servicedDate();

  static ImmutableExplanationOfBenefit_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_AddItem.builder();
  }
}
