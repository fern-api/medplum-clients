package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<TestScript_Operation> operation();

  Optional<List<Extension>> extension();

  @JsonProperty("assert")
  Optional<TestScript_Assert> _assert();

  static ImmutableTestScript_Action.Builder builder() {
    return ImmutableTestScript_Action.builder();
  }
}
