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
    as = ImmutableTestScript_Destination.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Destination {
  Coding profile();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Integer> index();

  static ImmutableTestScript_Destination.ProfileBuildStage builder() {
    return ImmutableTestScript_Destination.builder();
  }
}
