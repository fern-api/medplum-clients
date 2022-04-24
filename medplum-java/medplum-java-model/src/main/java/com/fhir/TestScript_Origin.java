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
    as = ImmutableTestScript_Origin.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Origin {
  Optional<Integer> index();

  Coding profile();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Origin.ProfileBuildStage builder() {
    return ImmutableTestScript_Origin.builder();
  }
}
