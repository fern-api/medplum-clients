package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  List<TestScript_Action2> action();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Teardown.Builder builder() {
    return ImmutableTestScript_Teardown.builder();
  }
}
