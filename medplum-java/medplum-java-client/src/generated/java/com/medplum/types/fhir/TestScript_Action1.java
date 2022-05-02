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
    as = ImmutableTestScript_Action1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Action1 {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<TestScript_Operation> operation();

  @JsonProperty("assert")
  Optional<TestScript_Assert> _assert();

  static ImmutableTestScript_Action1.Builder builder() {
    return ImmutableTestScript_Action1.builder();
  }
}
