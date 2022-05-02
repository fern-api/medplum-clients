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
    as = ImmutableClaim_SupportingInfo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_SupportingInfo {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept category();

  Optional<String> valueString();

  Optional<Quantity> valueQuantity();

  Optional<Attachment> valueAttachment();

  Optional<Period> timingPeriod();

  Optional<CodeableConcept> reason();

  Optional<String> timingDate();

  Optional<Reference> valueReference();

  Optional<PositiveInt> sequence();

  Optional<String> id();

  Optional<CodeableConcept> code();

  Optional<Boolean> valueBoolean();

  static ImmutableClaim_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableClaim_SupportingInfo.builder();
  }
}
