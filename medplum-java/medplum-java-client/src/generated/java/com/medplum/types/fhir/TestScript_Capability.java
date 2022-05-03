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
  Optional<List<Integer>> origin();

  Optional<List<Uri>> link();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Integer> destination();

  Canonical capabilities();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> validated();

  Optional<Boolean> required();

  Optional<String> description();

  static ImmutableTestScript_Capability.CapabilitiesBuildStage builder() {
    return ImmutableTestScript_Capability.builder();
  }
}
