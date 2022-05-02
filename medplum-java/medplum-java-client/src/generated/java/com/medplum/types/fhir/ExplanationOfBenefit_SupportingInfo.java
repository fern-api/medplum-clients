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
  Optional<Reference> valueReference();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> sequence();

  Optional<String> timingDate();

  Optional<Quantity> valueQuantity();

  Optional<Coding> reason();

  Optional<String> id();

  Optional<Attachment> valueAttachment();

  Optional<CodeableConcept> code();

  CodeableConcept category();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueString();

  static ImmutableExplanationOfBenefit_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_SupportingInfo.builder();
  }
}
