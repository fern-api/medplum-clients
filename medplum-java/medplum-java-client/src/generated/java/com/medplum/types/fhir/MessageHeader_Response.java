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
    as = ImmutableMessageHeader_Response.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageHeader_Response {
  Optional<Id> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> details();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Messageheader_responseCode> code();

  static ImmutableMessageHeader_Response.Builder builder() {
    return ImmutableMessageHeader_Response.builder();
  }
}
