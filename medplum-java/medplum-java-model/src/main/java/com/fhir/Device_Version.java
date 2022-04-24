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
    as = ImmutableDevice_Version.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_Version {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<Identifier> component();

  Optional<String> value();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDevice_Version.Builder builder() {
    return ImmutableDevice_Version.builder();
  }
}
