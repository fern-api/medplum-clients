package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> id();

  Optional<List<Uri>> link();

  Canonical capabilities();

  Optional<List<Integer>> origin();

  Optional<Integer> destination();

  Optional<Boolean> validated();

  Optional<Boolean> required();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Capability.CapabilitiesBuildStage builder() {
    return ImmutableTestScript_Capability.builder();
  }
}
