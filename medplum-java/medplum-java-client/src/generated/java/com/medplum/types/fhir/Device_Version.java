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
    as = ImmutableDevice_Version.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_Version {
  Optional<String> id();

  Optional<String> value();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Identifier> component();

  static ImmutableDevice_Version.Builder builder() {
    return ImmutableDevice_Version.builder();
  }
}
