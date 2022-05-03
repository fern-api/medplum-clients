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
    as = ImmutableCapabilityStatement_Software.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Software {
  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<String> id();

  Optional<DateTime> releaseDate();

  Optional<String> name();

  Optional<List<Extension>> extension();

  static ImmutableCapabilityStatement_Software.Builder builder() {
    return ImmutableCapabilityStatement_Software.builder();
  }
}
