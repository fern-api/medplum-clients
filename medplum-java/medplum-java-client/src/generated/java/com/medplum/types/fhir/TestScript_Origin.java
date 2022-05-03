package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> index();

  Coding profile();

  static ImmutableTestScript_Origin.ProfileBuildStage builder() {
    return ImmutableTestScript_Origin.builder();
  }
}
