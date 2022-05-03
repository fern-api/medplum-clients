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
    as = ImmutableTiming.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Timing {
  Optional<CodeableConcept> code();

  Optional<List<DateTime>> event();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Timing_Repeat> repeat();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTiming.Builder builder() {
    return ImmutableTiming.builder();
  }
}
