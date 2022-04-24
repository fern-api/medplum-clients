package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Coding code();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Reference> valueReference();

  Optional<Range> valueRange();

  Optional<List<Extension>> extension();

  Optional<Quantity> valueQuantity();

  static ImmutableUsageContext.CodeBuildStage builder() {
    return ImmutableUsageContext.builder();
  }
}
