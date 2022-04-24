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
    as = ImmutableMessageHeader_Response.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader_Response {
  Optional<Messageheader_responseCode> code();

  Optional<List<Extension>> extension();

  Optional<Reference> details();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<id> identifier();

  static ImmutableMessageHeader_Response.Builder builder() {
    return ImmutableMessageHeader_Response.builder();
  }
}
