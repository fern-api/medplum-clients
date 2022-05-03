package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestScript_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Action {
  Optional<TestScript_Operation> operation();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  @JsonProperty("assert")
  Optional<TestScript_Assert> _assert();

  static ImmutableTestScript_Action.Builder builder() {
    return ImmutableTestScript_Action.builder();
  }
}
