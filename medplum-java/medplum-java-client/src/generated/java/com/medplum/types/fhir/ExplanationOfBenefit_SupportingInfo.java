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
  Optional<Attachment> valueAttachment();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> extension();

  Optional<Boolean> valueBoolean();

  Optional<Coding> reason();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueString();

  Optional<String> timingDate();

  CodeableConcept category();

  Optional<String> id();

  Optional<Reference> valueReference();

  Optional<PositiveInt> sequence();

  Optional<Quantity> valueQuantity();

  Optional<CodeableConcept> code();

  static ImmutableExplanationOfBenefit_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_SupportingInfo.builder();
  }
}
