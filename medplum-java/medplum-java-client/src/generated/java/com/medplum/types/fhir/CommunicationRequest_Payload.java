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
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> contentReference();

  Optional<List<Extension>> extension();

  Optional<Attachment> contentAttachment();

  Optional<String> contentString();

  Optional<String> id();

  static ImmutableCommunicationRequest_Payload.Builder builder() {
    return ImmutableCommunicationRequest_Payload.builder();
  }
}
