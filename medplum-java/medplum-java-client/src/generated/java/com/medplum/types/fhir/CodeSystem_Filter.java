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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Code>> operator();

  Optional<Code> code();

  Optional<String> value();

  Optional<List<Extension>> extension();

  static ImmutableCodeSystem_Filter.Builder builder() {
    return ImmutableCodeSystem_Filter.builder();
  }
}
