package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Destination.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Destination {
  Coding profile();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Integer> index();

  Optional<String> id();

  static ImmutableTestScript_Destination.ProfileBuildStage builder() {
    return ImmutableTestScript_Destination.builder();
  }
}
