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
  Optional<Boolean> validated();

  Optional<String> description();

  Optional<List<Uri>> link();

  Optional<Integer> destination();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Canonical capabilities();

  Optional<Boolean> required();

  Optional<List<Integer>> origin();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Capability.CapabilitiesBuildStage builder() {
    return ImmutableTestScript_Capability.builder();
  }
}
