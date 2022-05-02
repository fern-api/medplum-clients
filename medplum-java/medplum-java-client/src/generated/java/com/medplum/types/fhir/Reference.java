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
  Optional<Identifier> identifier();

  Optional<ResourceList> resource();

  Optional<String> id();

  Optional<String> reference();

  Optional<List<Extension>> extension();

  Optional<Uri> type();

  Optional<String> display();

  static ImmutableReference.Builder builder() {
    return ImmutableReference.builder();
  }
}
