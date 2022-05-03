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
    as = ImmutableTestScript_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Link {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Uri> url();

  static ImmutableTestScript_Link.Builder builder() {
    return ImmutableTestScript_Link.builder();
  }
}
