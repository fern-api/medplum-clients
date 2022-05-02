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
  @JsonProperty("assert")
  Optional<TestScript_Assert> _assert();

  Optional<TestScript_Operation> operation();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestScript_Action.Builder builder() {
    return ImmutableTestScript_Action.builder();
  }
}
