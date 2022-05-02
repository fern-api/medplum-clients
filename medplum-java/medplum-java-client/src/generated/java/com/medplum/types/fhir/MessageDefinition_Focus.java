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
    as = ImmutableMessageDefinition_Focus.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition_Focus {
  Optional<Code> code();

  Optional<UnsignedInt> min();

  Optional<String> max();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Canonical> profile();

  static ImmutableMessageDefinition_Focus.Builder builder() {
    return ImmutableMessageDefinition_Focus.builder();
  }
}
