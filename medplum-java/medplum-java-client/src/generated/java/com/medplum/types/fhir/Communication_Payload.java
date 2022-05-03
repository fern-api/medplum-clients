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

  Optional<String> id();

  Optional<String> contentString();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Attachment> contentAttachment();

  static ImmutableCommunication_Payload.Builder builder() {
    return ImmutableCommunication_Payload.builder();
  }
}
