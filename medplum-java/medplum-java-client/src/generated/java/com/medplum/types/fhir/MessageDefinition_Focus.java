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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Canonical> profile();

  Optional<String> max();

  Optional<UnsignedInt> min();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> code();

  static ImmutableMessageDefinition_Focus.Builder builder() {
    return ImmutableMessageDefinition_Focus.builder();
  }
}
