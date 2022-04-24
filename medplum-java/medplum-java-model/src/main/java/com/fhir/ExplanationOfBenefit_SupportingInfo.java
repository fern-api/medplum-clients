package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Boolean> valueBoolean();

  Optional<Attachment> valueAttachment();

  Optional<String> timingDate();

  CodeableConcept category();

  Optional<CodeableConcept> code();

  Optional<positiveInt> sequence();

  Optional<Reference> valueReference();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<Coding> reason();

  Optional<String> valueString();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableExplanationOfBenefit_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_SupportingInfo.builder();
  }
}
