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
    as = ImmutableTestScript_Setup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Setup {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  List<TestScript_Action> action();

  Optional<String> id();

  static ImmutableTestScript_Setup.Builder builder() {
    return ImmutableTestScript_Setup.builder();
  }
}
