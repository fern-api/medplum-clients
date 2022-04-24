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
    as = ImmutableTestReport_Teardown.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Teardown {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  List<TestReport_Action2> action();

  static ImmutableTestReport_Teardown.Builder builder() {
    return ImmutableTestReport_Teardown.builder();
  }
}
