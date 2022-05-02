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
    as = ImmutableTestReport_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Action {
  @JsonProperty("assert")
  Optional<TestReport_Assert> _assert();

  Optional<TestReport_Operation> operation();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestReport_Action.Builder builder() {
    return ImmutableTestReport_Action.builder();
  }
}
