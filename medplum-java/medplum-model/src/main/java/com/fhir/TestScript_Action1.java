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
    as = ImmutableTestScript_Action1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Action1 {
  Optional<TestScript_Operation> operation();

  Optional<List<Extension>> modifierExtension();

  @JsonProperty("assert")
  Optional<TestScript_Assert> _assert();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableTestScript_Action1.Builder builder() {
    return ImmutableTestScript_Action1.builder();
  }
}
