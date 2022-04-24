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
    as = ImmutableMessageHeader_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader_Source {
  Optional<List<Extension>> modifierExtension();

  Optional<String> software();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> version();

  Optional<String> name();

  Optional<ContactPoint> contact();

  Optional<url> endpoint();

  static ImmutableMessageHeader_Source.Builder builder() {
    return ImmutableMessageHeader_Source.builder();
  }
}
