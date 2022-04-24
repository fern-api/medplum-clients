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
    as = ImmutableUserConfiguration_Menu.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration_Menu {
  Optional<List<UserConfiguration_Menu_Link>> link();

  Optional<String> title();

  static ImmutableUserConfiguration_Menu.Builder builder() {
    return ImmutableUserConfiguration_Menu.builder();
  }
}
