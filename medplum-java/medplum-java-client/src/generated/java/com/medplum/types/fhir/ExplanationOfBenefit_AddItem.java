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
  Optional<List<CodeableConcept>> modifier();

  Optional<String> servicedDate();

  Optional<List<ExplanationOfBenefit_Detail1>> detail();

  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> subSite();

  Optional<List<PositiveInt>> itemSequence();

  Optional<String> id();

  Optional<CodeableConcept> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<PositiveInt>> subDetailSequence();

  Optional<List<CodeableConcept>> programCode();

  Optional<Decimal> factor();

  Optional<Money> net();

  Optional<List<Reference>> provider();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Period> servicedPeriod();

  Optional<Money> unitPrice();

  Optional<Reference> locationReference();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> detailSequence();

  Optional<Address> locationAddress();

  Optional<CodeableConcept> locationCodeableConcept();

  static ImmutableExplanationOfBenefit_AddItem.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_AddItem.builder();
  }
}
