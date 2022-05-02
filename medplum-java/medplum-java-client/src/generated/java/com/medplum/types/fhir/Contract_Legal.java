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
    as = ImmutableContract_Legal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Legal {
  Optional<Attachment> contentAttachment();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> contentReference();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableContract_Legal.Builder builder() {
    return ImmutableContract_Legal.builder();
  }
}
