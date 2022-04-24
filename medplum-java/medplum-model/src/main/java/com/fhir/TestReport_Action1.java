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
    as = ImmutableTestReport_Action1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Action1 {
  Optional<List<Extension>> extension();

  @JsonProperty("assert")
  Optional<TestReport_Assert> _assert();

  Optional<String> id();

  Optional<TestReport_Operation> operation();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestReport_Action1.Builder builder() {
    return ImmutableTestReport_Action1.builder();
  }
}
