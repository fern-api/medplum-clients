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

  Optional<String> id();

  Optional<ResourceList> resource();

  Optional<String> display();

  Optional<Identifier> identifier();

  Optional<Uri> type();

  static ImmutableReference.Builder builder() {
    return ImmutableReference.builder();
  }
}
