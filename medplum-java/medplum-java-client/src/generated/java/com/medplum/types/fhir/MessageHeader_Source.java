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
  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> version();

  Optional<String> id();

  Optional<Url> endpoint();

  Optional<ContactPoint> contact();

  Optional<List<Extension>> modifierExtension();

  Optional<String> software();

  static ImmutableMessageHeader_Source.Builder builder() {
    return ImmutableMessageHeader_Source.builder();
  }
}
