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
    as = ImmutableCommunicationRequest_Payload.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CommunicationRequest_Payload {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Reference> contentReference();

  Optional<Attachment> contentAttachment();

  Optional<String> contentString();

  static ImmutableCommunicationRequest_Payload.Builder builder() {
    return ImmutableCommunicationRequest_Payload.builder();
  }
}
