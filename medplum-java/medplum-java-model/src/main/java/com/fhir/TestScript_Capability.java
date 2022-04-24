package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Capability.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Capability {
  Optional<String> description();

  Optional<Boolean> validated();

  Optional<String> id();

  Optional<List<Integer>> origin();

  Optional<Integer> destination();

  Optional<Boolean> required();

  Optional<List<Extension>> extension();

  canonical capabilities();

  Optional<List<uri>> link();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Capability.CapabilitiesBuildStage builder() {
    return ImmutableTestScript_Capability.builder();
  }
}
