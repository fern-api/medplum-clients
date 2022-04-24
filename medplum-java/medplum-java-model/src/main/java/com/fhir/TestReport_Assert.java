package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestReport_Assert.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Assert {
  Optional<markdown> message();

  Optional<String> detail();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Testreport_assertResult> result();

  Optional<String> id();

  static ImmutableTestReport_Assert.Builder builder() {
    return ImmutableTestReport_Assert.builder();
  }
}
