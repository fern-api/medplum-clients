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
    as = ImmutableTestScript_Test.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Test {
  List<TestScript_Action1> action();

  Optional<String> id();

  Optional<String> description();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Test.Builder builder() {
    return ImmutableTestScript_Test.builder();
  }
}
