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
  Optional<String> id();

  Optional<List<Extension>> extension();

  List<TestScript_Action> action();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Setup.Builder builder() {
    return ImmutableTestScript_Setup.builder();
  }
}
