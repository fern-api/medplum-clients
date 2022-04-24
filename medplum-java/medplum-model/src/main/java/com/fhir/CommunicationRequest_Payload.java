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
    as = ImmutableCommunicationRequest_Payload.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CommunicationRequest_Payload {
  Optional<Reference> contentReference();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> contentString();

  Optional<Attachment> contentAttachment();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCommunicationRequest_Payload.Builder builder() {
    return ImmutableCommunicationRequest_Payload.builder();
  }
}
