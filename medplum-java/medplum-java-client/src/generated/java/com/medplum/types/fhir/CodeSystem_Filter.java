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
    as = ImmutableCodeSystem_Filter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Filter {
  Optional<String> value();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  Optional<String> id();

  Optional<List<Code>> operator();

  static ImmutableCodeSystem_Filter.Builder builder() {
    return ImmutableCodeSystem_Filter.builder();
  }
}
