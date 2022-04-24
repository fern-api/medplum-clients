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
    as = ImmutableUserConfiguration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration {
  Optional<String> resourceType();

  Optional<id> id();

  Optional<String> name();

  Optional<List<UserConfiguration_Search>> search();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<uri> implicitRules();

  Optional<List<UserConfiguration_Menu>> menu();

  Optional<List<UserConfiguration_Option>> option();

  static ImmutableUserConfiguration.Builder builder() {
    return ImmutableUserConfiguration.builder();
  }
}