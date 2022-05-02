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
    as = ImmutableTestReport_Assert.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Assert {
  Optional<String> id();

  Optional<String> detail();

  Optional<Testreport_assertResult> result();

  Optional<Markdown> message();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestReport_Assert.Builder builder() {
    return ImmutableTestReport_Assert.builder();
  }
}
