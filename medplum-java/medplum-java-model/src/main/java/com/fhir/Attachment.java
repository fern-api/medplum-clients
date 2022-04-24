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
    as = ImmutableAttachment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Attachment {
  Optional<unsignedInt> size();

  Optional<String> title();

  Optional<url> url();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<code> contentType();

  Optional<base64Binary> hash();

  Optional<dateTime> creation();

  Optional<code> language();

  Optional<base64Binary> data();

  static ImmutableAttachment.Builder builder() {
    return ImmutableAttachment.builder();
  }
}
