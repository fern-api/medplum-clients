package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUserConfiguration_Menu_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration_Menu_Link {
  Optional<String> target();

  Optional<String> name();

  static ImmutableUserConfiguration_Menu_Link.Builder builder() {
    return ImmutableUserConfiguration_Menu_Link.builder();
  }
}
