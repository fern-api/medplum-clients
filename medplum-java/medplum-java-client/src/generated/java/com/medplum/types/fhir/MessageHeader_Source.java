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
    as = ImmutableMessageHeader_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader_Source {
  Optional<Url> endpoint();

  Optional<String> version();

  Optional<String> software();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<ContactPoint> contact();

  static ImmutableMessageHeader_Source.Builder builder() {
    return ImmutableMessageHeader_Source.builder();
  }
}
