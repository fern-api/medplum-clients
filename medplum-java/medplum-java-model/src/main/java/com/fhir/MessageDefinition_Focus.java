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
    as = ImmutableMessageDefinition_Focus.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition_Focus {
  Optional<canonical> profile();

  Optional<String> max();

  Optional<code> code();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<unsignedInt> min();

  Optional<List<Extension>> extension();

  static ImmutableMessageDefinition_Focus.Builder builder() {
    return ImmutableMessageDefinition_Focus.builder();
  }
}
