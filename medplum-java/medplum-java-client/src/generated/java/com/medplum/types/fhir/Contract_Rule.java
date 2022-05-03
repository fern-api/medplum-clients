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
    as = ImmutableContract_Rule.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Rule {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Reference> contentReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Attachment> contentAttachment();

  static ImmutableContract_Rule.Builder builder() {
    return ImmutableContract_Rule.builder();
  }
}
