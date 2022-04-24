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
    as = ImmutableTestScript_Setup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Setup {
  Optional<String> id();

  List<TestScript_Action> action();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Setup.Builder builder() {
    return ImmutableTestScript_Setup.builder();
  }
}
