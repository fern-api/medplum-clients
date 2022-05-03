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
  Optional<Reference> details();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Id> identifier();

  Optional<Messageheader_responseCode> code();

  static ImmutableMessageHeader_Response.Builder builder() {
    return ImmutableMessageHeader_Response.builder();
  }
}
