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
  CodeableConcept category();

  Optional<Quantity> valueQuantity();

  Optional<String> valueString();

  Optional<String> id();

  Optional<Period> timingPeriod();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<String> timingDate();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<Attachment> valueAttachment();

  Optional<CodeableConcept> reason();

  Optional<PositiveInt> sequence();

  Optional<Reference> valueReference();

  static ImmutableClaim_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableClaim_SupportingInfo.builder();
  }
}
