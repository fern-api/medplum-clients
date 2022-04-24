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
    as = ImmutableContract_Legal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Legal {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> contentReference();

  Optional<Attachment> contentAttachment();

  Optional<String> id();

  static ImmutableContract_Legal.Builder builder() {
    return ImmutableContract_Legal.builder();
  }
}
