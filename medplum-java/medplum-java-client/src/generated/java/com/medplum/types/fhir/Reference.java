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
    as = ImmutableReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Reference {
  Optional<List<Extension>> extension();

  Optional<String> reference();

  Optional<Identifier> identifier();

  Optional<String> display();

  Optional<String> id();

  Optional<Uri> type();

  Optional<ResourceList> resource();

  static ImmutableReference.Builder builder() {
    return ImmutableReference.builder();
  }
}
