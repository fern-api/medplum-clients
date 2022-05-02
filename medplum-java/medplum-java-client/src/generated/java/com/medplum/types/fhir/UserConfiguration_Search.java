package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUserConfiguration_Search.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration_Search {
  Optional<String> criteria();

  Optional<String> name();

  static ImmutableUserConfiguration_Search.Builder builder() {
    return ImmutableUserConfiguration_Search.builder();
  }
}
