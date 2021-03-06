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
    as = ImmutableCommunication_Payload.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Communication_Payload {
  Optional<Reference> contentReference();

  Optional<Attachment> contentAttachment();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> contentString();

  Optional<String> id();

  static ImmutableCommunication_Payload.Builder builder() {
    return ImmutableCommunication_Payload.builder();
  }
}
