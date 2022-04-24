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
    as = ImmutableTestReport_Setup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Setup {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  List<TestReport_Action> action();

  static ImmutableTestReport_Setup.Builder builder() {
    return ImmutableTestReport_Setup.builder();
  }
}
