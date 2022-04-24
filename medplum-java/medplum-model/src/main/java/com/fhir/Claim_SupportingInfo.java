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
    as = ImmutableClaim_SupportingInfo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_SupportingInfo {
  CodeableConcept category();

  Optional<String> valueString();

  Optional<CodeableConcept> reason();

  Optional<List<Extension>> extension();

  Optional<String> timingDate();

  Optional<Boolean> valueBoolean();

  Optional<Period> timingPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  Optional<Quantity> valueQuantity();

  Optional<String> id();

  Optional<positiveInt> sequence();

  Optional<Attachment> valueAttachment();

  Optional<CodeableConcept> code();

  static ImmutableClaim_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableClaim_SupportingInfo.builder();
  }
}
