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
    as = ImmutableAttachment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Attachment {
  Optional<String> title();

  Optional<Base64Binary> data();

  Optional<Code> language();

  Optional<UnsignedInt> size();

  Optional<List<Extension>> extension();

  Optional<Base64Binary> hash();

  Optional<Url> url();

  Optional<String> id();

  Optional<Code> contentType();

  Optional<DateTime> creation();

  static ImmutableAttachment.Builder builder() {
    return ImmutableAttachment.builder();
  }
}
