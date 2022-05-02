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
    as = ImmutableBundle_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Link {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Uri> url();

  Optional<String> relation();

  static ImmutableBundle_Link.Builder builder() {
    return ImmutableBundle_Link.builder();
  }
}
