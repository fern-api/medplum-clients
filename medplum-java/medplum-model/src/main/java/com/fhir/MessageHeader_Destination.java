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
    as = ImmutableMessageHeader_Destination.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader_Destination {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<Reference> target();

  Optional<String> id();

  Optional<Reference> receiver();

  Optional<url> endpoint();

  static ImmutableMessageHeader_Destination.Builder builder() {
    return ImmutableMessageHeader_Destination.builder();
  }
}
