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
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  Optional<String> valueString();

  Optional<Reference> valueReference();

  Optional<Period> timingPeriod();

  Optional<String> id();

  Optional<Quantity> valueQuantity();

  Optional<Boolean> valueBoolean();

  Optional<CodeableConcept> reason();

  Optional<String> timingDate();

  Optional<Attachment> valueAttachment();

  Optional<PositiveInt> sequence();

  CodeableConcept category();

  Optional<List<Extension>> extension();

  static ImmutableClaim_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableClaim_SupportingInfo.builder();
  }
}
