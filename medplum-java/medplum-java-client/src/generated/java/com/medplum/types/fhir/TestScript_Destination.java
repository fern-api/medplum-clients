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
  Optional<Integer> index();

  Optional<List<Extension>> modifierExtension();

  Coding profile();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableTestScript_Destination.ProfileBuildStage builder() {
    return ImmutableTestScript_Destination.builder();
  }
}
