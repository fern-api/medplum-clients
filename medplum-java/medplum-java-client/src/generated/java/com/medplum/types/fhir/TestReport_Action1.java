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
    as = ImmutableTestReport_Action1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Action1 {
  Optional<List<Extension>> modifierExtension();

  @JsonProperty("assert")
  Optional<TestReport_Assert> _assert();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<TestReport_Operation> operation();

  static ImmutableTestReport_Action1.Builder builder() {
    return ImmutableTestReport_Action1.builder();
  }
}
