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
    as = ImmutableReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Reference {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<uri> type();

  Optional<String> display();

  Optional<String> reference();

  Optional<Identifier> identifier();

  Optional<ResourceList> resource();

  static ImmutableReference.Builder builder() {
    return ImmutableReference.builder();
  }
}
