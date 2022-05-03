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
  Optional<Boolean> valueBoolean();

  Optional<Reference> valueReference();

  Optional<String> valueString();

  Optional<PositiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<Period> timingPeriod();

  Optional<CodeableConcept> reason();

  Optional<Attachment> valueAttachment();

  Optional<CodeableConcept> code();

  Optional<String> timingDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> valueQuantity();

  Optional<String> id();

  CodeableConcept category();

  static ImmutableClaim_SupportingInfo.CategoryBuildStage builder() {
    return ImmutableClaim_SupportingInfo.builder();
  }
}
