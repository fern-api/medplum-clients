package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExplanationOfBenefit_SupportingInfo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_SupportingInfo {
  Optional<String> id();

  Optional<PositiveInt> sequence();

  CodeableConcept category();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<Reference> valueReference();

  Optional<Attachment> valueAttachment();

  Optional<String> timingDate();

  Optional<Coding> reason();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<String> valueString();

  Optional<Period> timingPeriod();

  static ImmutableExplanationOfBenefit_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_SupportingInfo.builder();
  }
}
