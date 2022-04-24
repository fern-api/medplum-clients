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
    as = ImmutableContract_Rule.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Rule {
  Optional<String> id();

  Optional<Attachment> contentAttachment();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> contentReference();

  static ImmutableContract_Rule.Builder builder() {
    return ImmutableContract_Rule.builder();
  }
}
