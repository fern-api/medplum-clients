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
    as = ImmutableTiming.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Timing {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> code();

  Optional<Timing_Repeat> repeat();

  Optional<List<Extension>> extension();

  Optional<List<dateTime>> event();

  Optional<String> id();

  static ImmutableTiming.Builder builder() {
    return ImmutableTiming.builder();
  }
}
