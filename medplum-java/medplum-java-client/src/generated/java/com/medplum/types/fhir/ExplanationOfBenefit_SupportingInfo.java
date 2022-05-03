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
  Optional<Boolean> valueBoolean();

  Optional<Attachment> valueAttachment();

  Optional<Reference> valueReference();

  Optional<PositiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<String> timingDate();

  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  Optional<Coding> reason();

  Optional<CodeableConcept> code();

  Optional<Quantity> valueQuantity();

  Optional<String> id();

  Optional<String> valueString();

  Optional<Period> timingPeriod();

  static ImmutableExplanationOfBenefit_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_SupportingInfo.builder();
  }
}
