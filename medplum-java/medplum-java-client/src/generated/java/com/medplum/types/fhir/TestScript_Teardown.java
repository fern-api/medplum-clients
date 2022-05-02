package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Teardown.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Teardown {
  Optional<List<Extension>> modifierExtension();

  List<TestScript_Action2> action();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableTestScript_Teardown.Builder builder() {
    return ImmutableTestScript_Teardown.builder();
  }
}
