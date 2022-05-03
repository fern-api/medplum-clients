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
    as = ImmutableUserConfiguration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration {
  Optional<List<UserConfiguration_Option>> option();

  Optional<Meta> meta();

  Optional<String> resourceType();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<String> name();

  Optional<List<UserConfiguration_Menu>> menu();

  Optional<Code> language();

  Optional<List<UserConfiguration_Search>> search();

  static ImmutableUserConfiguration.Builder builder() {
    return ImmutableUserConfiguration.builder();
  }
}
