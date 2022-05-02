package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUsageContext.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UsageContext {
  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<Range> valueRange();

  Optional<Reference> valueReference();

  Coding code();

  static ImmutableUsageContext.CodeBuildStage builder() {
    return ImmutableUsageContext.builder();
  }
}
